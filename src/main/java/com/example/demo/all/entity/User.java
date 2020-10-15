package com.example.demo.all.entity;

import javax.persistence.*;
import java.util.ArrayList;

@Entity
@Table(name= "users")
public class User {




    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "fullname")
    private String fullName;

    @Column(name = "forsage")
    private int forsage;

    @Column(name = "forsageparent")
    private int parentForsage;

    public int getParentForsage() {
        return parentForsage;
    }

    public void setParentForsage(int parentForsage) {
        this.parentForsage = parentForsage;
    }

    @Transient
    public ArrayList <User> Children = new ArrayList<>();


    public void setChildren(ArrayList<User> children) {
        Children = children;
    }

    public void addChildren(User child){
        if(Children.size()<2) {
            Children.add(child);
        }
    }



    public User(){}

    public User(int forsage, int parentForsage, String fullName){
        this.forsage = forsage;
        this.fullName = fullName;
        this.parentForsage = parentForsage;
    }



    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }


    public int getForsage() {
        return forsage;
    }

    public void setForsage(int value) {
        this.forsage = value;
    }




}
