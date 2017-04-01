package com.sina.necomaker.gilgamesh.client.kubo.gateway;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Created by guiqiang on 29/03/2017.
 */
@FeignClient("kubo")
public interface KuboClient {

    @RequestMapping(value = "/home", method = RequestMethod.GET)
    public String kubo();
}
