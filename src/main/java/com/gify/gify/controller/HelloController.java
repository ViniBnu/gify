package com.gify.gify.controller;

import com.gify.gify.model.Gify;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@RestController
public class HelloController {

    @RequestMapping("/")
    public String hello() {
        return "ola";
    }

    @RequestMapping("/gifys")
    public List<Gify> all() {
        return new ArrayList<>(Arrays.asList(new Gify("gatinho"), new Gify("gatinho2")));
    }
}