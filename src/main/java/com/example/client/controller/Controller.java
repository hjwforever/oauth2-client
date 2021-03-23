package com.example.client.controller;

import org.springframework.security.core.Authentication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Copyright(C), 2020-2021, aruoxi.com
 * FileName: Controller
 * Author: hjwforever
 * Date: 2021/3/23 002318:44
 * Description: 客户端控制类
 */
@RestController
@RequestMapping("/user")
public class Controller {

    @RequestMapping("/getCurrentUser")
    public Object getCurrentUser(Authentication authentication) {
        return  authentication;
    }

}
