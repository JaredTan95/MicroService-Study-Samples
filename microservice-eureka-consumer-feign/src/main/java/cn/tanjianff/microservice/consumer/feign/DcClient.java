/*
 * Copyright (c) 重庆交通大学.信息科学与工程学院.
 */

package cn.tanjianff.microservice.consumer.feign;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient("eureka-client")
public interface DcClient {
    @GetMapping("/dc")
    String consumer();
}