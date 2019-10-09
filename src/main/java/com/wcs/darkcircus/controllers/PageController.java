package com.wcs.darkcircus.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
class PageController{

    @GetMapping("/home")
    public String home(){
        return "home";
    }
    @GetMapping("/freaks")
    public String freaks(){
        return "freaks";
    }
    @GetMapping("/who")
    public String who(){
        return "who";
    }
    @GetMapping("/tour")
    public String tour(){
        return "tour";
    }
}