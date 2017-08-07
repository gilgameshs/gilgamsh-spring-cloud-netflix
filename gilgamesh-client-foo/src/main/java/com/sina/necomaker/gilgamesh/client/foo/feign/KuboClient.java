package com.sina.necomaker.gilgamesh.client.foo.feign;

import com.sina.necomaker.gilgamesh.client.foo.configuration.KuboConfiguration;
import com.sina.necomaker.gilgamesh.client.kubo.vo.User;
import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Created by guiqiang on 29/03/2017.
 */
@FeignClient(name = "kubo", configuration = KuboConfiguration.class)
public interface KuboClient {

    @RequestMapping(value = "/kubo", method = RequestMethod.GET)
    String kubo();

    @RequestMapping(value = "/dina", method = RequestMethod.POST)
    String dina(User user);
}
