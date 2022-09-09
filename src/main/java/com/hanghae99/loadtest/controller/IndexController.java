package com.hanghae99.loadtest.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.Date;

@Controller
public class IndexController {

    @GetMapping("/")
    public String home(){
        return "index";
    }

    @GetMapping("/time")
    public String time(Model model) {
        model.addAttribute("time", new Date());
        return "time";
    }
}
