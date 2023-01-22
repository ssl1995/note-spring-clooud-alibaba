package com.ssl.note.seata.order.controller;


import com.ssl.note.seata.order.entity.Order;
import com.ssl.note.seata.order.service.IOrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RestController;

/**
 * <p>
 * 前端控制器
 * </p>
 *
 * @author songshenglin
 * @since 2023-01-22
 */
@RestController
@RequestMapping("/order")
public class OrderController {

    @Autowired
    private IOrderService orderService;

    @GetMapping("/get/{id}")
    public Order getById(Integer productId) {
        return orderService.getById(productId);
    }

    @GetMapping("/create/{id}")
    public void createById(Integer productId) {
        orderService.createOrder(productId);
    }


}
