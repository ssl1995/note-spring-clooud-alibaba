package com.ssl.note.sentinel8401;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@EnableDiscoveryClient
@SpringBootApplication
public class Sentinel8401Application {

    public static void main(String[] args) {
        SpringApplication.run(Sentinel8401Application.class, args);
    }

}
