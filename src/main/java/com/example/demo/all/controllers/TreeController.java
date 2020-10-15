package com.example.demo.all.controllers;

import com.example.demo.all.entity.User;
import com.example.demo.all.logic.ForsageTree;
import com.example.demo.all.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@CrossOrigin(origins = "http://localhost:4200")
@RestController
public class TreeController {


    @ResponseBody
    @RequestMapping(method = RequestMethod.GET, path = "/tree")
    public User getTree(){
        ForsageTree.constructTestTree();
        return ForsageTree.getRoot();
    }















}
