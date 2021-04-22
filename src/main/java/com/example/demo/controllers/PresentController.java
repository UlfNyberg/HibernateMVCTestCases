package com.example.demo.controllers;

import com.example.demo.models.Capital;
import com.example.demo.models.Present;
import com.example.demo.repos.ChildRepository;
import com.example.demo.repos.CountryRepository;
import com.example.demo.repos.PresentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by: Ulf Nyberg
 * Date: 2021-04-22
 * Time: 09:58
 * Project: demo1
 * Copyright: MIT
 */
@RestController
@RequestMapping(path="/present")
public class PresentController {

    @Autowired
    private PresentRepository presentRepository;


    @Autowired
    private CountryRepository countryRepository;

    @Autowired
    private ChildRepository childRepository;

    @GetMapping(path="/add")
    public String addPresent(@RequestParam String name){
        Present c = new Present();
        c.setName(name);
        presentRepository.save(c);
        return name + " was added";
    }

    @GetMapping(path="/all")
    public Iterable <Present> getAllPresents(){
        return presentRepository.findAll();

    }

}
