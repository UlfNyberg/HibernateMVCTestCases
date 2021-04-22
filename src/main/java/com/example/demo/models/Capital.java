package com.example.demo.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

/**
 * Created by: Ulf Nyberg
 * Date: 2021-04-20
 * Time: 13:27
 * Project: demo1
 * Copyright: MIT
 */
@Entity
public class Capital {

    @Id
    @GeneratedValue
    private Long Id;

    private String name;

    public Capital (){}

    public Capital(String name) {
        this.name = name;
    }

    public Capital(Long id, String name) {
        Id = id;
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
