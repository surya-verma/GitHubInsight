package com.proj.github.insight.config;

import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

/**
 * RestConfig
 *
 * @author Surya Verma
 * @version 1.0
 * @since 2020-06-08
 */

@Component
public class RestConfig {

    @Bean
    public RestTemplate getRestTemplate() {
        return new RestTemplate();
    }
}
