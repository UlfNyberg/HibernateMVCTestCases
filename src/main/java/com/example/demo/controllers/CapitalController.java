package com.example.demo.controllers;

import com.example.demo.models.Capital;
import com.example.demo.repos.CapitalRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by: Ulf Nyberg
 * Date: 2021-04-20
 * Time: 13:53
 * Project: demo1
 * Copyright: MIT
 */
@RestController
@RequestMapping(path="/capital")
public class CapitalController {

    @Autowired
    private CapitalRepository capitalRepository;

    private static final Logger log = LoggerFactory.getLogger(CapitalController.class);

    @GetMapping (path="/add")
    public String addCapital(@RequestParam String name){
        Capital c = new Capital();
        c.setName(name);
        capitalRepository.save(c);
        log.info("A Capital has been added by the name of " + name);
        log.debug("Debugging add Capitals");
        return name + " was added";
    }

    @GetMapping(path="/all")
    public Iterable <Capital> getAllCapital(){
        log.info("Someone want to access all the capitals");
        return capitalRepository.findAll();

    }

    @GetMapping(path="/getById")
    public Capital getById(@RequestParam long id){
        return capitalRepository.findById(id).get();
    }
}
