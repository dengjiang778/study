package com.example.demo.controller.admin;

import org.springframework.security.access.annotation.Secured;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Map;


@RequestMapping("/admin")
@Controller
public class adminIndexController {


    @RequestMapping(value = "/index")
    @PreAuthorize("hasAuthority('index.update')")
    public String index(Map<String, Object> map) {
        return "index";
    }


    @RequestMapping(value = "/update")
    @PreAuthorize("hasAuthority('index.update')")
    public String update(Map<String, Object> map) {
        return "index";
    }
}
