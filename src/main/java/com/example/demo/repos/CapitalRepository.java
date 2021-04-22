package com.example.demo.repos;

import com.example.demo.models.Capital;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

/**
 * Created by: Ulf Nyberg
 * Date: 2021-04-20
 * Time: 13:50
 * Project: demo1
 * Copyright: MIT
 */
public interface CapitalRepository extends CrudRepository<Capital, Long> {
    Capital findByName (String name);
}
