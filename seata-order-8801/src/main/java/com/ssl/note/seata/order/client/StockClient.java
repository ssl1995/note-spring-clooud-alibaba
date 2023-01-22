package com.ssl.note.seata.order.client;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * @Author: SongShengLin
 * @Date: 2023/01/22 22:28
 * @Describe:
 */
@FeignClient(name = "seata-stock")
public interface StockClient {

    @GetMapping("/stock/decrement")
    void decrement(@RequestParam("productId") Integer productId);

}