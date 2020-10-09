package com.example.demo.all.controllers;

import com.example.demo.all.services.UserService;
import com.example.demo.all.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@CrossOrigin(origins = "http://localhost:4200")
@RestController
public class UserController {

    @Autowired
    private UserService userService;

    @ResponseBody
    @RequestMapping(method = RequestMethod.GET, path = "/")
    public String testConnect(){
        return "Pyramid";
    }


    /**
     * @return the list of all users fetched from db
     */
    @ResponseBody
    @RequestMapping(method = RequestMethod.GET, path = "/users/all")
    public List<User> retrieveAllUsers(){
        return userService.getAllUsers();
    }

    /**
     * @return user by value in tree
     *
     */
    @ResponseBody
    @RequestMapping(method = RequestMethod.GET, path = "/user/{value}")
    public User retrieveUserByValue(@PathVariable int value) {
        return userService.getUserByValue(value);
    }


    /**
     * @return user by value in tree
     *
     */
    @ResponseBody
    @RequestMapping(method = RequestMethod.GET, path = "/user/{id}")
    public User retrieveUserUserById(@PathVariable int id) {
        return userService.getUserByValue(id);
    }

    /**
     * Adds user with value and forsageID to DB
     * @return response status
     *
     */
    @RequestMapping(method = RequestMethod.POST, path = "/user")
    public ResponseEntity<Void> addUser(@RequestBody User user) {

        userService.save(user);
        return ResponseEntity.ok().build();
    }


    /**
     *  Update an user with.. various info,
     * @param id in db of the user to be updated
     * @return
     */
    @RequestMapping(method = RequestMethod.POST, path = "/user/{id}")
    public ResponseEntity<Void> updateUser(@PathVariable Integer id) {

        //TODO decide how to update the user
        User user = userService.getUserById(id);
        // user.set( user ??????? )
        userService.save(user);
        return ResponseEntity.ok().build();

    }









}
