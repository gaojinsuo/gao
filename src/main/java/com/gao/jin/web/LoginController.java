package com.gao.jin.web;

import com.gao.jin.annotation.AopLog;
import com.gao.jin.dto.User;
import com.gao.jin.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("user")
public class LoginController {

    @Autowired
    private UserService userService;
    @PostMapping("login")
    @AopLog(userName = "gao",message = "error")
    public void login(User user) throws Exception{
        throw new Exception("it is not right");
    }

    @PostMapping("regist")
    @AopLog(userName = "gao",message = "error")
    public void regist(@RequestBody User user) throws Exception{
        int i = userService.regist(user);
    }
}
