package com.company;

public class CheckingsAccount extends BankAccount {

    public CheckingsAccount(int balance) {
        super(balance);
    }

    @Override
    public void withdraw(int value) {
        this.balance = this.balance - value;
        if(value <= this.balance){
            this.balance -= value;
            System.out.println("Amount withdrawn: $" + (this.balance - value));
            System.out.println("Current Checking Balance: $" + this.balance);
        }else{
            System.err.println("Insufficient funds in Checking account. Transaction cancelled.");
                    }
    }

    @Override
    public void deposit(int value) {
        this.balance = this.balance + value;
        System.out.println("Current Checking Balance: $" + this.balance);


    }
}
