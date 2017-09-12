package com.ssm.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import com.ssm.service.UserService;

import javax.servlet.http.HttpServletRequest;

@Controller
@RequestMapping("/test1")
public class UserController {

    @Autowired
    private UserService usersService;

//    @RequestMapping(value = "/find", method = RequestMethod.POST)

    //    public String addUser(@RequestParam(name="username") String username, @RequestParam(name="password") String password) {
//        usersService.addUser(username,password);
//        return "SUCCESS";
//    }
    @RequestMapping(value = "/test")
    public @ResponseBody  String  insert() {
        System.out.print("ssss");
        return "ssss";

    }

}
