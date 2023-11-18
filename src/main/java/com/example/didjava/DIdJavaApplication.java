package com.example.didjava;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients
public class DIdJavaApplication {

    public static void main(String[] args) {
        SpringApplication.run(DIdJavaApplication.class, args);
    }

}
