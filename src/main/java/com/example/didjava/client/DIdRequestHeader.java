package com.example.didjava.client;

import feign.RequestInterceptor;
import feign.Retryer;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;


public class DIdRequestHeader {
    @Value("${did.api-key}")
    String didApiKey;

    @Bean
    public RequestInterceptor requestInterceptor() {
        return requestTemplate -> {
            requestTemplate.header("Authorization", didApiKey);
            requestTemplate.header("USER-AGENT", "Mozilla/5.0");
            requestTemplate.header("Content-Type", "application/json");
        };
    }
}
