package com.sina.necomaker.gilgamesh.client.kubo.controller;

import com.netflix.discovery.converters.Auto;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import com.sina.necomaker.gilgamesh.client.kubo.service.KuboService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by guiqiang on 29/03/2017.
 */
@RestController
public class KuboController {

    private static final Logger log = LoggerFactory.getLogger(KuboController.class);

    @Autowired
    private DiscoveryClient discoveryClient;

    @Autowired
    private KuboService kuboService;

    @RequestMapping(value = "/kubo", method = RequestMethod.GET)
    public String kubo() {
        ServiceInstance instance = discoveryClient.getLocalServiceInstance();
        log.info("/kubo, host: " + instance.getHost() + ", service_id: " + instance.getServiceId() + ", service_port: " + instance.getPort());
        return kuboService.home();
    }


}
