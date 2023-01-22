package com.ssl.note.seata.order.service.impl;

import com.ssl.note.seata.order.entity.Order;
import com.ssl.note.seata.order.mapper.OrderMapper;
import com.ssl.note.seata.order.service.IOrderService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
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
}
