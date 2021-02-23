package com.kgc;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class MyProviderApp {
    public static void main(String[] args) {
        SpringApplication.run(MyProviderApp.class,args);
    }
}
