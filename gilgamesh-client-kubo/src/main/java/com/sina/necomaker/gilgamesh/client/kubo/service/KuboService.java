package com.sina.necomaker.gilgamesh.client.kubo.service;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.springframework.stereotype.Service;

/**
 * Created by guiqiang on 31/03/2017.
 */
@Service
public class KuboService {

    @HystrixCommand(fallbackMethod = "homeFallback")
    public String home(){
        return "kubo service";
    }

    public String homeFallback(){
        return "kubo homeFallback";
    }

}
