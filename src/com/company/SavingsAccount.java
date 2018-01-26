package com.company;

public class SavingsAccount extends BankAccount {

    public SavingsAccount(int balance) {
        super(balance);
    }

    @Override
    public void withdraw(int value) {
        this.balance = this.balance - value;
        System.out.println("Amount withdrawn: $" + (this.balance - value));
        System.out.println("Current Savings Balance: $" + this.balance);
    }

    @Override
    public void deposit(int value) {
        this.balance = this.balance + value;
        System.out.println("Current Savings Balance: $" + this.balance);
    }
}
