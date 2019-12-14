package com.lzq.mirco.sevice;

import org.apache.dubbo.config.spring.context.annotation.EnableDubbo;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @author liangziqiang
 */
@SpringBootApplication
@EnableDubbo
public class ServiceWithDubboApplication {

    public static void main(String[] args) {
        SpringApplication.run(ServiceWithDubboApplication.class, args);
    }

}
