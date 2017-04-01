package com.sina.necomaker.gilgamesh.client.foo.configuration;

import feign.Logger;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * Created by guiqiang on 31/03/2017.
 */
@Configuration
public class KuboConfiguration {
    @Bean
    Logger.Level feignLoggerLevel() {
        return Logger.Level.FULL;
    }
}