package com.fwtai;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@EnableEurekaClient
@SpringBootApplication
public class Product8081{

    public static void main(final String[] args){
        SpringApplication.run(Product8081.class,args);
        System.out.println("product8081应用已启动");
    }
}