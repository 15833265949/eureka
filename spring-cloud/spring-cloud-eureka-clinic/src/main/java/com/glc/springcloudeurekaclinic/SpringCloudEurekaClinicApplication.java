package com.glc.springcloudeurekaclinic;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@EnableEurekaClient
@RestController
public class SpringCloudEurekaClinicApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringCloudEurekaClinicApplication.class, args);
    }




    @Value("${server.port}")
    String port;

    @RequestMapping("/hello")
    public String home(@RequestParam(value = "name",defaultValue = "glc") String name){
        return "你好" + name + "----" + port;
    }
}
