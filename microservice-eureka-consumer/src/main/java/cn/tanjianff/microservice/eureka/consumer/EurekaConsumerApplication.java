/*
 * Copyright (c) 重庆交通大学.信息科学与工程学院.
 */

package cn.tanjianff.microservice.eureka.consumer;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

@EnableDiscoveryClient
@SpringBootApplication
public class EurekaConsumerApplication {
    @Bean
    public RestTemplate restTemplate() {
        return new RestTemplate();
    }
    public static void main(String[] args) {
        new SpringApplicationBuilder(EurekaConsumerApplication.class).web(true).run(args);
    }
}
