package com.sina.necomaker.gilgamesh.client.foo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * Created by Travis on 2016/12/8.
 */
@SpringBootApplication
@EnableDiscoveryClient
@EnableAutoConfiguration
@EnableCircuitBreaker
public class FooApplication {
    public static void main(String[] args){
        SpringApplication.run(FooApplication.class,args);
    }

}