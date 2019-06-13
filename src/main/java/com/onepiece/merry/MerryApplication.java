package com.onepiece.merry;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class MerryApplication {

    public static void main(String[] args) {
        SpringApplication.run(MerryApplication.class, args);
    }

}
