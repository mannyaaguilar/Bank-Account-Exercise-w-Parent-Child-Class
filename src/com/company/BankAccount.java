package com.company;

public class BankAccount {

    int balance;



    public BankAccount(int balance){

        this.balance = balance;

    }

    public void withdraw(int value){
        this.balance -= value;
        }

    public void deposit(int value) {
        this.balance += value;
    }

}
