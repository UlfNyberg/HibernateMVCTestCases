package com.example.demo.controllers;

import com.example.demo.models.Capital;
import com.example.demo.models.Country;
import com.example.demo.repos.CapitalRepository;
import com.example.demo.repos.CountryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * Created by: Ulf Nyberg
 * Date: 2021-04-20
 * Time: 13:53
 * Project: demo1
 * Copyright: MIT
 */
@RestController
@RequestMapping(path="/country")
public class CountryController {

    @Autowired
    private CountryRepository countryRepository;

    @Autowired
    private CapitalRepository capitalRepository;

    @GetMapping(path="/add")
    public String addCountry(@RequestParam String name, @RequestParam String capital){

        Capital existingCapital = capitalRepository.findByName(capital);

        if (existingCapital == null){
            Capital c = new Capital(capital);
            Country country = new Country(name, c);
            countryRepository.save(country);

        }
        else {
            Country country = new Country(name, existingCapital);
            countryRepository.save(country);
        }

        return name + " was added";
    }

    @GetMapping(path="/all")
    public Iterable <Country> getAllCountries(){
        return countryRepository.findAll();

    }
}
