package com.example.demo.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/admin")
public class AdminController {

    @RequestMapping("/ADMIN1")
    public String hello() {
        return "hello";

    }
    @RequestMapping("/ADMIN2")
    public String hello2() {
        return "hello2";
    }
}
