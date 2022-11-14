package com.ssl.note.controller;

import com.ssl.note.service.OpenFeignService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author SongShengLin
 * @date 2022/11/14 00:13
 * @description
 */
@RestController
public class OpenFeignController {

    @Autowired
    private OpenFeignService openFeignService;

    @GetMapping("/openFeign/hello")
    public String getOpenFeignHello() {
        return openFeignService.hello();
    }

}
