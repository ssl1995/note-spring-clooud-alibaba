package com.ssl.note.seata.order;

import com.ssl.note.seata.order.client.StockClient;
import com.ssl.note.seata.order.entity.Order;
import com.ssl.note.seata.order.service.IOrderService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class OrderTest {

    @Autowired
    private IOrderService orderService;

    @Autowired
    private StockClient stockClient;

    @Test
    void getById() {
        Integer id = 1;
        Order order = orderService.getById(id);
        System.out.println(order);
    }

    @Test
    void decrement() {
        Integer id = 1;
        stockClient.decrement(id);
    }

    @Test
    void crete() {
        Integer productId = 1;
        orderService.createOrder(productId);
    }

}
