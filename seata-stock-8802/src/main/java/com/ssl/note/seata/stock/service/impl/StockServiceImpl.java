package com.ssl.note.seata.stock.service.impl;

import com.ssl.note.seata.stock.entity.Stock;
import com.ssl.note.seata.stock.mapper.StockMapper;
import com.ssl.note.seata.stock.service.IStockService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 服务实现类
 * </p>
 *
 * @author songshenglin
 * @since 2023-01-22
 */
@Service
@Slf4j
public class StockServiceImpl extends ServiceImpl<StockMapper, Stock> implements IStockService {

    @Autowired
    private StockMapper stockMapper;

    @Override
    public void decrement(Integer id) {
        Stock stock = stockMapper.selectById(id);
        Integer count = stock.getCount();
        log.info("更新库存前，库存数量:{},id:{}", count, id);
        stock.setCount(count - 1);
        stockMapper.updateById(stock);
        log.info("更新库存后，库存数量:{},id:{}", count - 1, id);
    }
}
