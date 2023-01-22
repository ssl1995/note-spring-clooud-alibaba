package com.ssl.note.seata.order;

import com.ssl.note.seata.order.entity.Order;
import com.ssl.note.seata.order.service.IOrderService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class OrderTest {

    @Autowired
    private IOrderService orderService;

    @Test
    void getById() {
        Integer id = 1;
        Order order = orderService.getById(id);
        System.out.println(order);
    }

}
