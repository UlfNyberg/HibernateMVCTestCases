package com.example.demo.models;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonManagedReference;

import javax.persistence.*;
import java.util.List;

/**
 * Created by: Ulf Nyberg
 * Date: 2021-04-20
 * Time: 13:30
 * Project: demo1
 * Copyright: MIT
 */

@Entity
public class Country {

    @Id
    @GeneratedValue
    private Long Id;

    private String name;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name="capitalId", referencedColumnName = "id")
    private Capital capital;

    @OneToMany (mappedBy="country")
    @JsonManagedReference
    private List<Child> children;

    public Country (){}

    public Country(String name, Capital capital) {
        this.name = name;
        this.capital = capital;
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

    public List<Child> getChildren() {
        return children;
    }

    public void setChildren(List<Child> children) {
        this.children = children;
    }
}
