package com.ssl.note.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * @author SongShengLin
 * @date 2022/11/14 00:10
 * @description
 */
@Service
@FeignClient(value = "nacos-provider")
public interface OpenFeignService {

    @GetMapping("/hello")
    String hello();
}
