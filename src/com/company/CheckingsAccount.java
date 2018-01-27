package com.company;

public class CheckingsAccount extends BankAccount {

    public CheckingsAccount(int balance) {
        super(balance);
    }

    @Override
    public void withdraw(int value) {
        this.balance = this.balance - value;
        if(value == 0){
            System.out.println(" ");
            System.out.println("Current Checking Balance: $" + balance);
        }
        else if (value >= this.balance){
//            this.balance -= value;
            System.err.println("Insufficient funds in Checking account. Transaction cancelled.");


        }if ((value > 1)){System.out.println("Amount withdrawn from Checking: $" + value);
                          System.out.println("Checking Balance: $" + balance);
                    }

    }

    @Override
    public void deposit(int value) {
        this.balance = this.balance + value;

        if(value == 0){
            System.out.println(" ");
            }
            else{
            System.out.println("Amount deposited to Checking: $" + value);
            System.out.println("Checking Balance: $" + this.balance);}
        }


    }

