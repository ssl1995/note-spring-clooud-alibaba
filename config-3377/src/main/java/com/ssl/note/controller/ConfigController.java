package com.ssl.note.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author SongShengLin
 * @date 2022/11/13 21:24
 * @description
 */
@RestController
@RefreshScope // nocas配置中心，修改后自动刷新，无需重新启动项目
public class ConfigController {
    /**
     * 读取Nacos配置中心的配置
     */
    @Value("${config.info}")
    private String configInfo;

    @GetMapping("/config/info")
    public String getConfigInfo() {
        return configInfo;
    }
}
