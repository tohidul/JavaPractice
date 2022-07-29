package com.tohidul.OopPractice;

public class User {
    private String accountNumber;
    private String password;

    public User(String accountNumber, String password){
        this.accountNumber = accountNumber;
        this.password = password;
    }
    public User(){}

    public void setAccountNumber(String accountNumber){
        this.accountNumber = accountNumber;
    }
    public String getAccountNumber(){
        return accountNumber;
    }

    public void setPassword(String password){
        this.password = password;
    }
    public String getPassword(){
        return password;
    }
}
