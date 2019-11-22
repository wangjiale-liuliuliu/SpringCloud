package com.wjl;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;


@SpringBootApplication
@EnableEurekaClient
public class TestApplication8003 {

    public static void main(String[] args) {
        SpringApplication.run(TestApplication8003.class, args);
    }

}
