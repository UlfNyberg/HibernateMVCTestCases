package com.example.demo.controllers;

import com.example.demo.models.Child;
import com.example.demo.models.Country;
import com.example.demo.models.Present;
import com.example.demo.repos.CapitalRepository;
import com.example.demo.repos.ChildRepository;
import com.example.demo.repos.CountryRepository;
import com.example.demo.repos.PresentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

/**
 * Created by: Ulf Nyberg
 * Date: 2021-04-20
 * Time: 15:26
 * Project: demo1
 * Copyright: MIT
 */
@RestController
@RequestMapping(path="/child")
public class ChildController {


    @Autowired
    private CountryRepository countryRepository;

    @Autowired
    private ChildRepository childRepository;

    @Autowired
    private PresentRepository presentRepository;

    @GetMapping(path="/add")
    public String addChild(@RequestParam String name, @RequestParam String country){
        Country existingCountry = countryRepository.findByName(country);
        Child c = new Child(name, existingCountry);
        childRepository.save(c);

        return name + " was added";
    }

    @GetMapping(path="/addWithPresents")
    public String addWithPresents(@RequestParam String name, @RequestParam String country, @RequestParam String wishes){
        Country existingCountry = countryRepository.findByName(country);
        Present existingPresent = presentRepository.findByName(wishes);
        List<Present> presList = Arrays.asList(existingPresent);
        Child c = new Child(name, existingCountry, presList);
        childRepository.save(c);

        return name + " was added";
    }

    @GetMapping(path="/addWithPresentsAndGets")
    public String addWithPresentsAndGets(@RequestParam String name, @RequestParam String country, @RequestParam String wishes, @RequestParam String gets){
        Country existingCountry = countryRepository.findByName(country);
        Present existingPresent = presentRepository.findByName(wishes);
        Present getsInRepo = presentRepository.findByName(gets);
        List<Present> presList = Arrays.asList(existingPresent);
        List<Present> getList = Arrays.asList(existingPresent);
        Child c = new Child(name, existingCountry, presList, getList);
        childRepository.save(c);

        return name + " was added";
    }



    @GetMapping(path="/all")
    public Iterable <Child> getAllChildren(){
        return childRepository.findAll();

    }





}
