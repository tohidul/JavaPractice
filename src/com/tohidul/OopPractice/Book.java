package com.tohidul.OopPractice;

public class Book {
    private String name;
    private Author author;
    private double price;
    private int number_of_unit;

    public Book(String name, Author author, double price, int number_of_unit){
        this.name = name;
        this.author = author;
        this.price = price;
        this.number_of_unit = number_of_unit;
    }

    public void setName(String name){
        this.name = name;
    }
    public void setAuthor(Author author){
        this.author = author;
    }
    public void setPrice(double price){
        this.price = price;
    }
    public void setNumber_of_unit(int number_of_unit){
        this.number_of_unit = number_of_unit;
    }

    public String getName(){
        return name;
    }
    public Author getAuthor(){
        return author;
    }
    public double getPrice(){
        return price;
    }
    public int getNumber_of_unit(){
        return number_of_unit;
    }
}
