package com.sina.necomaker.gilgamesh.client.foo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.cloud.client.SpringCloudApplication;
import org.springframework.cloud.netflix.feign.EnableFeignClients;
import org.springframework.cloud.netflix.hystrix.dashboard.EnableHystrixDashboard;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;
import org.springframework.context.annotation.ComponentScan;

/**
 * Created by Travis on 2016/12/8.
 */

@EnableAutoConfiguration
@EnableHystrixDashboard
@EnableFeignClients
@SpringCloudApplication
@ComponentScan(basePackages = {"com.sina.necomaker.gilgamesh"})
public class FooApplication {

    public static void main(String[] args){
        SpringApplication.run(FooApplication.class,args);
    }

}
