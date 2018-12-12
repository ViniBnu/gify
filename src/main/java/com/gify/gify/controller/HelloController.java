package com.gify.gify.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class HelloController {

    @RequestMapping("/")
    public String hello() {
        return "ola";
    }

    @PostMapping("/gify")
    public String addGify() {
        return "whatever";
    }
}
