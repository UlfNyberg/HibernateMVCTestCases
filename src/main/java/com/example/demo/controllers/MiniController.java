package com.example.demo.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by: Ulf Nyberg
 * Date: 2021-04-22
 * Time: 15:05
 * Project: demo1
 * Copyright: MIT
 */
@RestController
public class MiniController {

    @RequestMapping(path="/")
    public String helloWorld(){
        return "hello world";
    }
}
