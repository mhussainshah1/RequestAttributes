package model;
//POJO - Plain old java object

//Java Bean
//1- Implements Serializable
//2- no arg constructor e.g. Person()
//3- private members with getters and setters eg:- String getFirstName() ,  setFirstName(String firstName)

import java.io.Serializable;

public class Person implements Serializable {
    private String firstName;
    private String lastName;
    private int age;

    public Person() {
        this.firstName = "Bob";
        this.lastName = "Jenkins";
        age = 30;
    }

    public Person(String firstName, String lastName, int age) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
