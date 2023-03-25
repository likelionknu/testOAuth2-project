package com.example.oauth2test.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class firstController {

    @RequestMapping(value="/")
    @ResponseBody
    public String home(){
        return "<h1> Hello</h1>";
    }
}
