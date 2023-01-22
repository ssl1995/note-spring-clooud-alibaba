package com.ssl.note.seata.stock;

import com.ssl.note.seata.stock.entity.Stock;
import com.ssl.note.seata.stock.service.IStockService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class StockTest {

    @Autowired
    private IStockService stockService;

    @Test
    void getById() {
        Integer id = 1;
        Stock stock = stockService.getById(id);
        System.out.println(stock);
    }

    @Test
    void decrement() {
        Integer id = 1;
        stockService.decrement(id);
    }


}
