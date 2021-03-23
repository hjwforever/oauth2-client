package com.example.client;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.oauth2.client.EnableOAuth2Sso;

/**
 * Copyright(C), 2020-2021, aruoxi.com
 * FileName: Application
 * Author: hjwforever
 * Date: 2021/3/23 002318:42
 * Description:
 */
@SpringBootApplication
// 开启单点登录
@EnableOAuth2Sso
public class Application {
    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }
}
