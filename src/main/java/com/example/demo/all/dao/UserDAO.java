package com.example.demo.all.dao;

import com.example.demo.all.entity.User;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserDAO extends CrudRepository<User, Integer> {


    //User findByValue(int value);

    User findByForsage(int value);

}


