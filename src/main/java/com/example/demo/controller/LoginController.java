package com.example.demo.controller;

import com.example.demo.mapper.UserMapper;
import com.example.demo.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpSession;

@Controller
public class LoginController {

    @Autowired
    private UserMapper userMapper;

    @RequestMapping("/login")
    @ResponseBody
    public String login(String username, String password, HttpSession session) throws Exception {
        User user = userMapper.findByUserName(username);
        if (!user.getPassword().equals(password)) {
            throw new Exception("密码错误");
        }
        session.setAttribute("userId", user.getId());
        return "登录成功";
    }

    @RequestMapping("/logout")
    @ResponseBody
    public String logout(HttpSession session) {
        session.removeAttribute("userId");
        return "注销成功";
    }
}
