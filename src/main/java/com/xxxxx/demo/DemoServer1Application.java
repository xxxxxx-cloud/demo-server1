package com.xxxxx.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;


/**
 * @author 金世强
 */
@SpringBootApplication
@EnableFeignClients
@EnableDiscoveryClient
public class DemoServer1Application {

    public static void main(String[] args) {
        SpringApplication.run(DemoServer1Application.class, args);
    }

}
