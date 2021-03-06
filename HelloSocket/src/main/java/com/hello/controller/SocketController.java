package com.hello.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class SocketController {
    @RequestMapping
    public String index(Model model){
        model.addAttribute("msg","Hello Socket!");
        return "index";
    }

    @RequestMapping("/ws")
    public String ws(Model model){
        model.addAttribute("msg","Web Socket!");
        return "socket";
    }

    @RequestMapping("/tio")
    public String tio(Model model){
        model.addAttribute("msg","Tio Socket!");
        return "tio";
    }
}
