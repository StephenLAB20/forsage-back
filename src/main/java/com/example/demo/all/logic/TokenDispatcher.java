package com.example.demo.all.logic;


import org.springframework.stereotype.Component;

import java.util.Random;

@Component
public class TokenDispatcher {



    public Token generateToken(){
        StringBuilder token = new StringBuilder();
        Random random = new Random();
        String [] letters
                = {"A","B","C","D","E","F","G","H","L","K","M","N","O"};
        for(int i = 0; i<5; i++){
           int index = random.nextInt(letters.length);
           token.append(letters[index]);
        }

        token.append(100000 + random.nextInt(899999));

        return new Token(token.toString());
    }



}
