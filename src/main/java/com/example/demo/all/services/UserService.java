package com.example.demo.all.services;

import com.example.demo.all.dao.UserDAO;
import com.example.demo.all.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class UserService {

   @Autowired
   private UserDAO userDAO;

   public void save(User user){
       userDAO.save(user);
   }

   public User getUserById(Integer id){
       return userDAO.findById(id).get();
   }

   public User getUserByValue(int value){
       return userDAO.findByValue(value);
   }

   public List<User> getAllUsers(){
       return (List<User>) userDAO.findAll();
   }



}
