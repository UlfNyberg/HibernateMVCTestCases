package com.example.demo.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

/**
 * Created by: Ulf Nyberg
 * Date: 2021-04-22
 * Time: 09:58
 * Project: demo1
 * Copyright: MIT
 */
@Entity
public class Present {

    @Id
    @GeneratedValue
    private Long Id;

    private String name;

    public Present (){}

    public Present(String name) {
        this.name = name;
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
}
