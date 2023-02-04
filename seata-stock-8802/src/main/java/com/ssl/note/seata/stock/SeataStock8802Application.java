package com.ssl.note.seata.stock;

import com.ulisesbocchio.jasyptspringboot.annotation.EnableEncryptableProperties;
import org.jasypt.encryption.StringEncryptor;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.ApplicationContext;
import org.springframework.core.env.Environment;

@SpringBootApplication
@EnableDiscoveryClient
@EnableFeignClients
@MapperScan("com.ssl.note.seata.stock.mapper")
public class SeataStock8802Application {

    public static void main(String[] args) {
        SpringApplication.run(SeataStock8802Application.class, args);
    }

}
