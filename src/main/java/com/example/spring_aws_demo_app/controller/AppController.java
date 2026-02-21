package com.example.spring_aws_demo_app.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping(value = "/api")
@RestController
public class AppController {

    @GetMapping(value = "/{name}")
    public String getMsg(@PathVariable("name") String name) {
        return "Hello, ".concat(name);
    }

    @GetMapping(value = "/health/status")
    public String chkHealth() {
        return "Up!!";
    }
}
