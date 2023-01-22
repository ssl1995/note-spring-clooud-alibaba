package com.ssl.note.seata.order;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableDiscoveryClient
@EnableFeignClients
@MapperScan("com.ssl.note.seata.order.mapper")
public class SeataOrder8801Application {

    public static void main(String[] args) {
        SpringApplication.run(SeataOrder8801Application.class, args);
    }

}
