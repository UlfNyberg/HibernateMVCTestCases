package com.example.demo.repos;

import com.example.demo.models.Country;
import org.springframework.data.repository.CrudRepository;

/**
 * Created by: Ulf Nyberg
 * Date: 2021-04-20
 * Time: 13:50
 * Project: demo1
 * Copyright: MIT
 */
public interface CountryRepository extends CrudRepository<Country, Long> {

    Country findByName(String name);
}
