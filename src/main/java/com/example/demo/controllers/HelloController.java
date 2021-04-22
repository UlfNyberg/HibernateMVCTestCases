package com.example.demo.controllers;

import com.example.demo.models.Capital;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by: Ulf Nyberg
 * Date: 2021-04-22
 * Time: 13:10
 * Project: demo1
 * Copyright: MIT
 */
@RestController
@RequestMapping(path="/hello")
public class HelloController {

    @GetMapping(path="/")
    public String helloWorld(){
        return "hello world";
    }

    @GetMapping(path="/esp")
    public String helloWorldSpanish(){
        return "hola world";
    }




}
