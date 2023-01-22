package com.ssl.note.seata.order.service.impl;

import com.ssl.note.seata.order.client.StockClient;
import com.ssl.note.seata.order.entity.Order;
import com.ssl.note.seata.order.mapper.OrderMapper;
import com.ssl.note.seata.order.service.IOrderService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import io.seata.spring.annotation.GlobalTransactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Objects;

/**
 * <p>
 * 服务实现类
 * </p>
 *
 * @author songshenglin
 * @since 2023-01-22
 */
@Service
public class OrderServiceImpl extends ServiceImpl<OrderMapper, Order> implements IOrderService {
    @Autowired
    private OrderMapper orderMapper;

    @Autowired
    private StockClient stockClient;

    @Override
    @GlobalTransactional // 开启分布式事务
    public void createOrder(Integer productId) {
        // 减库存
        stockClient.decrement(productId);

        // 模拟异常
        // 如果开启了分布式事务 + 断点到这里，发生了异常的话
        // undo_log表会提前存储好更新前的数据，便于回滚
        int i = 1 / 0;

        // 新增一个订单
        Order order = new Order();
        order.setProductId(productId);
        order.setCount(1);
        orderMapper.insert(order);
    }
}
