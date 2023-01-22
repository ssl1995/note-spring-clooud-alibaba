package com.ssl.note.seata.stock.service.impl;

import com.ssl.note.seata.stock.entity.Stock;
import com.ssl.note.seata.stock.mapper.StockMapper;
import com.ssl.note.seata.stock.service.IStockService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author songshenglin
 * @since 2023-01-22
 */
@Service
public class StockServiceImpl extends ServiceImpl<StockMapper, Stock> implements IStockService {

}
