package com.sina.necomaker.gilgamesh.client.foo.controller;

import com.sina.necomaker.gilgamesh.client.foo.service.DeveloperNameService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by Travis on 2016/12/13.
 */
@RestController
public class DeveloperNameController {
    @Autowired
    private DeveloperNameService nameService;

    @RequestMapping("/developer/name")
    public String name(){
        return nameService.getName();
    }

    @RequestMapping("/")
    public String home(){
        return nameService.getHome();
    }
}
