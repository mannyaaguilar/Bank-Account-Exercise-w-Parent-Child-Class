package com.company;

public class Main {


    public static void main(String[] args) {
	// write your code here
        SavingsAccount savings = new SavingsAccount(500);
        CheckingsAccount checkings = new CheckingsAccount(500);

        savings.withdraw(0);
        checkings.withdraw(1000);

        savings.deposit(0);
        checkings.deposit(0);

//        System.out.println("Current Balance: $");
//
//
//        System.out.println("Amount withdrawn: $");
    }
}

