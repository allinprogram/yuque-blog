package com.allinprogram.yuqueblog.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * @author AllinProgram
 * @since 2022-03-29 16:48 星期二
 */
@Controller
public class WebController {

    @GetMapping
    public String index() {
        return "index";
    }
}
