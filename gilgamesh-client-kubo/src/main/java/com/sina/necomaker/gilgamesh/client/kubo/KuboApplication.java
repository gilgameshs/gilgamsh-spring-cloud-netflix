package com.sina.necomaker.gilgamesh.client.kubo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.hystrix.dashboard.EnableHystrixDashboard;
import org.springframework.cloud.netflix.ribbon.RibbonClient;
import org.springframework.context.annotation.ComponentScan;

/**
 * Created by guiqiang on 29/03/2017.
 */
@SpringBootApplication
@EnableDiscoveryClient
@EnableAutoConfiguration
@EnableEurekaClient
@EnableCircuitBreaker
@EnableHystrixDashboard
//@RibbonClient(name = "kubo")
@ComponentScan(basePackages = "com.sina.necomaker.gilgamesh")
public class KuboApplication {
    public static void main(String[] args) {
        SpringApplication.run(KuboApplication.class, args);
    }
}
