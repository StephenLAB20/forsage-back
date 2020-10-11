package com.example.demo.all.controllers;

import com.example.demo.all.logic.Token;
import com.example.demo.all.logic.TokenDispatcher;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.io.*;
import java.util.Properties;

@CrossOrigin(origins = "http://localhost:4200")
@RestController
public class AuthController {


    private Properties props = new Properties();

    @Autowired
    private TokenDispatcher tokenDispatcher;

    @RequestMapping(method = RequestMethod.POST, path = "/check/{var1}/{var2}")
    public ResponseEntity<Token> getToken
            (@PathVariable String var1, @PathVariable String var2) throws FileNotFoundException {

        File file = new File("src/main/resources/static/credentials.properties");
        InputStream inputStream = new FileInputStream(file);
        try {
            props.load(inputStream);
        } catch (IOException e) {
            e.printStackTrace();
        }

        if(var1.trim().
                equals(props.getProperty("user").trim())
        && var2.trim().equals(props.getProperty("password").trim())){
               return ResponseEntity.ok(tokenDispatcher.generateToken());
        }

        return ResponseEntity.status(HttpStatus.UNAUTHORIZED).build();
    }



}
