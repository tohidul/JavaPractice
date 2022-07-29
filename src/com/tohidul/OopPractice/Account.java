package com.tohidul.OopPractice;

public class Account {
    private int balance;
    public Account(int balance){
        if(balance<0){
            throw new IllegalArgumentException("balance must be a positive value or 0.");
        }
        this.balance = balance;
    }

    public void setBalance(int balance){
        if(balance<0){
            throw new IllegalArgumentException("balance must be a positive value or 0.");
        }
        this.balance = balance;
    }
    public int getBalance(){
        return this.balance;
    }
}
