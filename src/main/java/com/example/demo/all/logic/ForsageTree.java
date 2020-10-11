package com.example.demo.all.logic;

import com.example.demo.all.entity.User;

import java.util.concurrent.RecursiveTask;

public class ForsageTree {


   private static User root = new User(1, 143424);


   public static User getRoot(){
       return root;
   }

    private static User addRecursive(User current,int value, User toAdd) {
        if (current == null) {
            return new User(value,toAdd.getFullName());
        }

        if (value < current.getValue()) {
            current.leftUser = addRecursive(current.getLeftUser(), value, toAdd);
        } else if (value > current.getValue()) {
            current.rightUser = addRecursive(current.rightUser, value, toAdd);
        } else {
            // value already exists
            return current;
        }

        return current;
    }


    public static void add(User user) {
        root = addRecursive(root, user.getValue(), user);
    }

    public static void constructTestTree(){
        root = new User(6, "Vlaicu");

        User user2 = new User(4, "Iura");
        User user3 = new User(8, "Ion");
        User user4 = new User(3, "Kate");
        User user5 = new User(5, "Senea");
        User user6 = new User(7, "Serghei");
        User user7 = new User(9, "Vladimir");
        User user1 = new User(2, "Sasha");
        User user34 = new User(1, "PFFFFF");

        add(user1);
        add(user2);
        add(user3);
        add(user4);
        add(user5);
        add(user6);
        add(user7);
        add(user34);


    }





     // TODO fetch all Users from db
     // TODO based on this List construct the tree and return it
     //







}
