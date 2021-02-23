package com.kgc;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class MyProviderApp2 {
    public static void main(String[] args) {
        SpringApplication.run(MyProviderApp2.class,args);
    }
}
