package com.hinz.iplay.gateway;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@EnableDiscoveryClient
@SpringBootApplication
public class IplayGatewayApplication {

    public static void main(String[] args) {
        SpringApplication.run(IplayGatewayApplication.class, args);
    }

}
