package com.java2nb.novel;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * @author Pete
 * @version 1.0
 * @since 2021/6/15
 */
@SpringBootApplication
@EnableFeignClients
public class PayApplication {

    public static void main(String[] args) {
        SpringApplication.run(PayApplication.class);
    }
}
