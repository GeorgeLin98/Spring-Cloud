package com.george.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.hystrix.EnableHystrix;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients // 启动 feign
@EnableHystrix // 启动 hystrix
public class ConsumerFeignHystrixOrder80Application {
    public static void main(String[] args) {
        SpringApplication.run(ConsumerFeignHystrixOrder80Application.class, args);
        System.out.println("启动成功");

    }
}
