package com.pineapple.business.note;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.ComponentScan;

/**
 * 业务启动类
 * @author lyk
 */
@EnableDiscoveryClient
@ComponentScan("com.pineapple")
@EnableFeignClients("com.pineapple.*.api")
@SpringBootApplication
public class BusinessNoteApplication {

    public static void main(String[] args) {
        SpringApplication.run(BusinessNoteApplication.class, args);
    }

}
