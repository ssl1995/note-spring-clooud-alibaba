package com.ssl.note.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import javax.annotation.Resource;

/**
 * @author SongShengLin
 * @date 2022/11/13 17:52
 * @description
 */
@RestController
public class DemoController {

    @Value("${service-url.nacos-user-service}")
    private String baseUrl;

    @Resource
    private RestTemplate restTemplate;


    @GetMapping("/consumer/nacos")
    public String getProviderPort() {
        System.out.println("baseUrl: " + baseUrl);
        return restTemplate.getForObject(baseUrl + "/hello", String.class);
    }
}
