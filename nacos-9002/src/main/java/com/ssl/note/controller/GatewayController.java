package com.ssl.note.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author: SongShengLin
 * @Date: 2023/01/20 16:56
 * @Describe:
 */
@RestController()
@RequestMapping("/route")
public class GatewayController {

    @Value("${server.port}")
    private String port;

    @GetMapping("/get")
    public String get() {
        return "gateway,端口：" + port;
    }
}
