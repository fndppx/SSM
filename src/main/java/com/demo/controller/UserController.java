package com.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/json")
public class UserController {

    @RequestMapping(value="/helloWorld")
    @ResponseBody
    public String helloWorld(){
       return "test";
    }
}
