package com.fwtai;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@EnableEurekaServer
@SpringBootApplication
public class EurekaServer{

    public static void main(final String[] args){
        SpringApplication.run(EurekaServer.class,args);
        System.out.println("注册中心已启动");
    }
}