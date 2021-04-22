package com.example.demo.models;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonManagedReference;

import javax.persistence.*;
import java.util.List;

/**
 * Created by: Ulf Nyberg
 * Date: 2021-04-20
 * Time: 15:24
 * Project: demo1
 * Copyright: MIT
 */
@Entity
public class Child {

    @Id
    @GeneratedValue (strategy = GenerationType.AUTO)
    private Long Id;

    private String name;

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn (name="countryId", referencedColumnName = "id")
    @JsonBackReference
    private Country country;

    @ManyToMany(cascade = CascadeType.ALL)
    @JoinTable
    private List<Present> wishes;

    @ManyToMany(cascade = CascadeType.ALL)
    @JoinTable
    private List<Present> gets;



    public Child (){}

    public Child(String name, Country country) {
        this.name = name;
        this.country = country;
    }

    public Child(String name, Country country, List<Present> wishes) {
        this.name = name;
        this.country = country;
        this.wishes = wishes;
    }

    public Child(String name, Country country, List<Present> wishes, List<Present> gets) {
        this.name = name;
        this.country = country;
        this.wishes = wishes;
        this.gets = gets;
    }

    public Long getId() {
        return Id;
    }

    public void setId(Long id) {
        Id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Country getCountry() {
        return country;
    }

    public void setCountry(Country country) {
        this.country = country;
    }

    public List<Present> getWishes() {
        return wishes;
    }

    public void setWishes(List<Present> wishes) {
        this.wishes = wishes;
    }
}
