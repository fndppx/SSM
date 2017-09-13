package com.ssm.controller;

import com.alibaba.fastjson.JSON;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import com.ssm.service.UserService;

import javax.servlet.http.HttpServletRequest;
import java.util.HashMap;
import java.util.Map;

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
        Map<String,String> map=new HashMap<String, String>();
        map.put("001", "sss");
        map.put("002", "sss");
        String jsonString = JSON.toJSONString(map);
        return jsonString;

    }

}
