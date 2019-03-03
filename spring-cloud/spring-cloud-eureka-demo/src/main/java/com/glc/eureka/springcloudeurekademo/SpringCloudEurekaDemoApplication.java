package com.glc.eureka.springcloudeurekademo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class SpringCloudEurekaDemoApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringCloudEurekaDemoApplication.class, args);
    }

}
