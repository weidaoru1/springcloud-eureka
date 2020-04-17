package com.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer  // 开启 Eureka 服务
public class ApplicationEureka8071 {

    public static void main(String[] args) {
        SpringApplication.run(ApplicationEureka8071.class, args);
    }

}
