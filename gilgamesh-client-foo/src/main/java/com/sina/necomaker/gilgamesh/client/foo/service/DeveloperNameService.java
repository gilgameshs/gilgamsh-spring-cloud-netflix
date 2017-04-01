package com.sina.necomaker.gilgamesh.client.foo.service;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import com.sina.necomaker.gilgamesh.client.foo.feign.KuboClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

/**
 * Created by Travis on 2016/12/12.
 */
@Service
public class DeveloperNameService {

    @Value("${travis.name}")
    private String home = "home";

    @Autowired
    private KuboClient kuboClient;

    @HystrixCommand(fallbackMethod = "defaultName")
    public String getName() {
        String kubo = kuboClient.kubo();
        return  "Travis Xu" + kubo;
    }

    @HystrixCommand(fallbackMethod = "defaultHome")
    public String getHome(){
        return  home + ": Travis Xu";
    }


    private String defaultName(){
        return "Dolores";
    }

    private String defaultHome(){
        return "Dolores home";
    }
}
