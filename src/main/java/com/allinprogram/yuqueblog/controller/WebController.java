package com.allinprogram.yuqueblog.controller;

import com.allinprogram.yuqueblog.infrastructure.dto.DocDTO;
import com.allinprogram.yuqueblog.infrastructure.dto.UserDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

/**
 * @author AllinProgram
 * @since 2022-03-29 16:48 星期二
 */
@Controller
public class WebController {

    @Autowired
    private YuqueController yuqueController;

    @GetMapping({"", "index"})
    public String index(Model model) {
        UserDTO user = yuqueController.getUser();
        model.addAttribute("user", user);

        List<DocDTO> docs = yuqueController.getDocs();
        model.addAttribute("docs", docs);
        return "index";
    }

    @GetMapping("about")
    public String about(Model model) {
        model.addAttribute("user", yuqueController.getUser());
        return "about";
    }
}
