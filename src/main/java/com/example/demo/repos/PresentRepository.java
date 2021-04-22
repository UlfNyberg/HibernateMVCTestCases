package com.example.demo.repos;

import com.example.demo.models.Country;
import com.example.demo.models.Present;
import org.springframework.data.repository.CrudRepository;

/**
 * Created by: Ulf Nyberg
 * Date: 2021-04-22
 * Time: 09:58
 * Project: demo1
 * Copyright: MIT
 */
public interface PresentRepository extends CrudRepository<Present, Long> {
    Present findByName(String name);
}
