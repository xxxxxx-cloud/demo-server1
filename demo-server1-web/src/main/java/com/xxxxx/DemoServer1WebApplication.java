package com.xxxxx;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;


/**
 * @author jinshiqiang
 */
@SpringBootApplication
@EnableFeignClients
@EnableDiscoveryClient
public class DemoServer1WebApplication {

    public static void main(String[] args) {
        SpringApplication.run(DemoServer1WebApplication.class, args);
    }


}
