package com.example.demo.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("api/layout")
@RestController
public class LayoutController {
    @RequestMapping("/LAYOUT")
    public String hello() {
        return "hello";
    }
    @RequestMapping("/LAYOUT2")
    public String hello2() {
        return "hello2";
    }
}
