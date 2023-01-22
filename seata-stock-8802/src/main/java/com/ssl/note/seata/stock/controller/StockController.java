package com.ssl.note.seata.stock.controller;


import com.ssl.note.seata.stock.service.IStockService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestParam;
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
@RequestMapping("/stock")
public class StockController {
    @Autowired
    private IStockService stockService;

    @GetMapping("/decrement")
    public void decrement(@RequestParam("productId") Integer productId) {
        stockService.decrement(productId);
    }

}
