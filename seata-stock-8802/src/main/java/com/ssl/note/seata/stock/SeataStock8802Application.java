package com.ssl.note.seata.stock;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableDiscoveryClient
@EnableFeignClients
@MapperScan("com.ssl.note.seata.stock.mapper")
public class SeataStock8802Application {

    public static void main(String[] args) {
        SpringApplication.run(SeataStock8802Application.class, args);
    }

}
