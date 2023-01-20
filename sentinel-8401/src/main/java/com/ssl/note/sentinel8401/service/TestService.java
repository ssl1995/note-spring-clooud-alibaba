package com.ssl.note.sentinel8401.service;

import com.alibaba.csp.sentinel.annotation.SentinelResource;
import org.springframework.stereotype.Service;

/**
 * @Author: SongShengLin
 * @Date: 2023/01/20 14:13
 * @Describe:
 */
@Service
public class TestService {

    /**
     * 流控-链路监控
     */
    @SentinelResource("common")
    public String common() {
        return "common";
    }
}
