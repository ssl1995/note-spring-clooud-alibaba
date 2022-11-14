package com.ssl.note.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author SongShengLin
 * @date 2022/11/13 16:32
 * @description
 */
@RestController
public class HelloController {
    @Value("${server.port}")
    private String port;

    @GetMapping("hello")
    public String hello() {
        return "hello: " + port;
    }

}
