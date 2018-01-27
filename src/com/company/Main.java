package com.company;

public class Main {


    public static void main(String[] args) {
	// write your code here
        SavingsAccount savings = new SavingsAccount(500);
        CheckingsAccount checkings = new CheckingsAccount(500);

        savings.withdraw(80);
        checkings.withdraw(80);

        savings.deposit(600);
        checkings.deposit(600);
    }
}

