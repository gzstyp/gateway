package com.fwtai;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.gateway.filter.ratelimit.KeyResolver;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.context.annotation.Bean;
import org.springframework.web.server.ServerWebExchange;
import reactor.core.publisher.Mono;

@SpringBootApplication
@EnableEurekaClient
@EnableDiscoveryClient
public class GateWay{

    public static void main(final String[] args){
        SpringApplication.run(GateWay.class,args);
        System.out.println("gateway应用已启动");
    }

    // 配置令牌桶,需要配合redis来一起使用
    @Bean
    public KeyResolver uriKeyResolver(){
        return new KeyResolver(){
            @Override
            public Mono<String> resolve(final ServerWebExchange exchange){
                //System.out.println(exchange.getRequest().getRemoteAddress().getAddress().getHostAddress());
                return Mono.just(exchange.getRequest().getRemoteAddress().getAddress().getHostAddress());
            }
        };
    }
}