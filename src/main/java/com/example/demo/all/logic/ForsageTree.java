package com.example.demo.all.logic;

import com.example.demo.all.entity.User;



public class ForsageTree {


   private static User root = new User(2, 1,"Vlaicu");


   public static User getRoot(){
       return root;
   }




    public static void addUser(User parent, User child){

        if(parent.getForsage() == child.getParentForsage()){
            parent.Children.add(child);
        }
        else {
            if(parent.Children.size()==1) {
                addUser(parent.Children.get(0), child);

            }   else if (parent.Children.size()==2) {
                addUser(parent.Children.get(0), child);
                addUser(parent.Children.get(1), child);
            }
        }





   }






    public static void constructTestTree(){


        root = new User(2, 1,"Vlaicu");
        User user1 = new User(3,2,"Iura");
        User user6 = new User(8, 2, "Tarlapan");
        User user2 = new User(4,3,"Ion");
        User user3 = new User(5,4,"Ciobanu");
        User user4 = new User(6,4,"Serioga");
        User user5 = new User(7,5,"Costea");
        User user7 = new User(9, 8, "Nolan");
        User user8 = new User(10,6,"Vladimir");


        addUser(root, user1);
        addUser(root, user2);
        addUser(root, user3);
        addUser(root, user4);
        addUser(root, user5);
        addUser(root, user6);
        addUser(root, user7);
        addUser(root, user8);



    }





     // TODO fetch all Users from db
     // TODO based on this List construct the tree and return it
     //







}
