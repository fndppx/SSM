package controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import service.UsersService;

@Controller
@RequestMapping("/users")
public class UsersController {

    @Autowired
    private UsersService usersService;

//    @RequestMapping(value = "/find", method = RequestMethod.POST)

    public String addUser(@RequestParam(name="username") String username, @RequestParam(name="password") String password) {
        usersService.addUser(username,password);
        return "SUCCESS";
    }

    public String test(){
        return "aaaa";
    }


}
