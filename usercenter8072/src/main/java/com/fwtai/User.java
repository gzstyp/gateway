package com.fwtai;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@EnableEurekaClient
@SpringBootApplication
public class User{

    public static void main(final String[] args){
        SpringApplication.run(User.class,args);
        System.out.println("usercenter应用已启动");
    }
}