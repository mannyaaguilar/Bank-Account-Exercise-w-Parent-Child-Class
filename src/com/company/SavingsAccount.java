package com.company;

public class SavingsAccount extends BankAccount {

    public SavingsAccount(int balance) {
        super(balance);
    }

    @Override
    public void withdraw(int value) {
        this.balance = this.balance - value;
        if(value == 0){
            System.out.println(" ");
            System.out.println("Current Savings Balance: $" + this.balance);
        }else{
        System.out.println("Amount withdrawn from Savings: $" + value);
            System.out.println("Savings Balance: $" + balance);
        }
    }

    @Override
    public void deposit(int value) {
        this.balance = this.balance + value;
        if (value == 0) {
            System.out.println(" ");
                    } else {
            System.out.println("Amount deposited to Savings: $" + value);
            System.out.println("Savings Balance: $" + this.balance);
        }
    }
}
