package com.example.demo.all.entity;

import javax.persistence.*;

@Entity
@Table(name= "users")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "fullname")
    private String fullName;

    @Transient
    public User leftUser;

    @Transient
    public User rightUser;



    @Column(name = "forsage_id")
    private int forsageID;

    @Column(name = "reference_link")
    private String referenceLink;

    @Column(name = "slotx3")
    private int currentSlotX3;

    @Column(name = "slotx4")
    private int currentSlotX4;

    @Column(name = "value")
    private int value;

    @Column(name = "left_user")
    private String leftChild = "" + leftUser + "";

    @Column(name = "right_user")
    private String rightChild = "" + rightUser + "";

    @Column(name = "phone")
    private String phone;

    @OneToOne(fetch = FetchType.LAZY,cascade = {CascadeType.ALL})
    @JoinColumn(name = "credentials_id")
    private Credentials credentials;


    public User(){}

    public User(int value, String fullName){
        this.value = value;
        this.fullName = fullName;
        this.leftUser = null;
        this.rightUser = null;
    }

    public Credentials getCredentials() {
        return credentials;
    }

    public void setCredentials(Credentials credentials) {
        this.credentials = credentials;
    }

    public User(int value, int forsageID){
        this.value = value;
        this.forsageID = forsageID;
        this.leftUser = null;
        this.rightUser = null;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public int getForsageID() {
        return forsageID;
    }

    public void setForsageID(int forsageID) {
        this.forsageID = forsageID;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getReferenceLink() {
        return referenceLink;
    }

    public void setReferenceLink(String referenceLink) {
        this.referenceLink = referenceLink;
    }

    public int getCurrentSlotX3() {
        return currentSlotX3;
    }

    public void setCurrentSlotX3(int currentSlotX3) {
        this.currentSlotX3 = currentSlotX3;
    }

    public int getCurrentSlotX4() {
        return currentSlotX4;
    }

    public void setCurrentSlotX4(int currentSlotX4) {
        this.currentSlotX4 = currentSlotX4;
    }

    public String getLeftChild() {
        return leftChild;
    }

    public void setLeftChild(String leftChild) {
        this.leftChild = leftChild;
    }

    public String getRightChild() {
        return rightChild;
    }

    public void setRightChild(String rightChild) {
        this.rightChild = rightChild;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public User getLeftUser() {
        return leftUser;
    }

    public void setLeftUser(User leftUser) {
        this.leftUser = leftUser;
    }

    public User getRightUser() {
        return rightUser;
    }

    public void setRightUser(User rightUser) {
        this.rightUser = rightUser;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    @Override
    public String toString() {
        return "User{" +
                "fullName='" + fullName + '\'' +
                ", ID='" + forsageID + '\'' +
                ", currentSlotX3=" + currentSlotX3 +
                ", currentSlotX4=" + currentSlotX4 +
                ", value=" + value +
                ", leftUser=" + leftUser +
                ", rightUser=" + rightUser +
                ", phone=" + phone +
                '}';
    }

}
