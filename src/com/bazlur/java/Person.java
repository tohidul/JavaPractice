package com.bazlur.java;

public class Person {
    private String personName;
    private int age;
    private String phoneNumber;

    public Person(){
    }

    public Person(String personName, int age, String phoneNumber){
        this.personName = personName;
        this.age = age;
        this.phoneNumber = phoneNumber;
    }

    public String getPersonName(){
        return personName;
    }
    public int getAge(){
        return age;
    }
    public String getPhoneNumber(){
        return phoneNumber;
    }
    public void setPersonName(String personName){
        this.personName = personName;
    }
    public void setAge(int age){
        this.age = age;
    }
    public void setPhoneNumber(String phoneNumber){
        this.phoneNumber = phoneNumber;
    }

    public void printInformation(){
        System.out.println("Person Name: "+getPersonName());
        System.out.println("Person age: "+getAge());
        System.out.println("Person Phone Number: "+getPhoneNumber());
    }

}
