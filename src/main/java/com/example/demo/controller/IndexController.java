package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.Map;

@Controller
public class IndexController {

    @RequestMapping(value = "/")
    public void root(HttpServletResponse response) throws IOException {
        response.sendRedirect("redirect:/index");
    }

    @RequestMapping(value = "/index")
    public String index(Map<String, Object> map) {
        return "index";

    }


}
