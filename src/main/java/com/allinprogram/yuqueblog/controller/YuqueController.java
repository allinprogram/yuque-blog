package com.allinprogram.yuqueblog.controller;

import com.alibaba.fastjson.JSONObject;
import com.allinprogram.yuqueblog.infrastructure.client.UserClient;
import com.allinprogram.yuqueblog.infrastructure.dto.UserDTO;
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
    public UserDTO getUser() {
        String rst = userClient.getUser();
        String dataJson = JSONObject.parseObject(rst).get("data").toString();
        return JSONObject.parseObject(dataJson, UserDTO.class);
    }
}