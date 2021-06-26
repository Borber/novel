package com.java2nb.novel;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * 新闻微服务启动器
 * @author Vic
 * @version 1.0
 * @since 2021/6/20
 */
@SpringBootApplication
@EnableFeignClients
public class NewsApplication {

    public static void main(String[] args) {
        SpringApplication.run(NewsApplication.class);
    }
}
