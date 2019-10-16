package com.atguigu.cache;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@MapperScan("com.atguigu.mapper")
@SpringBootApplication
public class SpringbootTestCacheApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringbootTestCacheApplication.class, args);
    }

}
