package com.sina.necomaker.gilgamesh.client.foo.configuration;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

/**
 * Created by Travis on 2016/12/8.
 */
@Component
@ConfigurationProperties(prefix = "travis")
@Setter
@Getter
@NoArgsConstructor
public class Travis {

    private String name;
}
