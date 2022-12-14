package com.ssl.note;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class Nocas9002Application {

    public static void main(String[] args) {
        SpringApplication.run(Nocas9002Application.class, args);
    }

}
