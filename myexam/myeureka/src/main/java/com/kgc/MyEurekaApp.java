package com.kgc;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class MyEurekaApp {
    // lnc update
    public static void main(String[] args) {
        SpringApplication.run(MyEurekaApp.class,args);
    }
}
