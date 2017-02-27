package com.sina.necomaker.gilgamesh.client.foo.service;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.springframework.stereotype.Service;

/**
 * Created by Travis on 2016/12/12.
 */
@Service
public class DeveloperNameService {
    @HystrixCommand(fallbackMethod = "defaultName")
    public String getName(){
        return  "Travis Xu";
    }

    private String defaultName(){
        return "Dolores";
    }
}
