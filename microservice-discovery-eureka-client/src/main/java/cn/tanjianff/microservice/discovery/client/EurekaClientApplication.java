/*
 * Copyright (c) 重庆交通大学.信息科学与工程学院.
 */

package cn.tanjianff.microservice.discovery.client;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@EnableEurekaClient
@RestController
public class EurekaClientApplication {

    public static void main(String[] args) {
        new SpringApplicationBuilder(
                EurekaClientApplication.class)
                .web(true).run(args);
    }
}