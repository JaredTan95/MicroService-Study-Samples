/*
 * Copyright (c) 重庆交通大学.信息科学与工程学院.
 */

package cn.tanjianff.microservice.consumer.feign;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.feign.EnableFeignClients;

@EnableFeignClients
@EnableDiscoveryClient
@SpringBootApplication
public class FeignConsumerApplication {
    public static void main(String[] args) {
        new SpringApplicationBuilder(FeignConsumerApplication.class)
                .web(true).run(args);
    }
}
