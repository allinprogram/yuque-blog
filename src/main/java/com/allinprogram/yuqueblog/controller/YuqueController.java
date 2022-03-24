package com.allinprogram.yuqueblog.controller;

import com.allinprogram.yuqueblog.infrastructure.client.UserClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 语雀API Controller
 *
 * @author AllinProgram
 * @since 2022-03-08 13:39 星期二
 */
@RestController
@RequestMapping("api")
public class YuqueController {

    @Autowired
    private UserClient userClient;

    @GetMapping("user")
    public String getUser() {
        return userClient.getUser();
    }
}