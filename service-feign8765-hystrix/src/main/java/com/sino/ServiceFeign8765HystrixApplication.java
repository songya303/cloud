package com.sino;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableDiscoveryClient
@EnableFeignClients
public class ServiceFeign8765HystrixApplication {

    public static void main(String[] args) {
        SpringApplication.run(ServiceFeign8765HystrixApplication.class, args);
    }

}
