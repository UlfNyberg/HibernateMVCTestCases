package com.example.demo.repos;

import com.example.demo.models.Child;
import org.springframework.data.repository.CrudRepository;

/**
 * Created by: Ulf Nyberg
 * Date: 2021-04-20
 * Time: 15:26
 * Project: demo1
 * Copyright: MIT
 */
public interface ChildRepository extends CrudRepository<Child, Long> {
}
