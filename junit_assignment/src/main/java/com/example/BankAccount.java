package com.example;

public class BankAccount {
    double balance;

    public BankAccount(double balance){
        this.balance = balance;
    }

    public String deposit(double amount){
        balance=balance+amount;
        return amount+" is successfully credited and your current balance is "+balance;
    }

    public String withdraw(double amount) throws InsufficientFundsException{
        if(amount<balance){
            balance=balance-amount;
            return amount+" is successfully debited and your current balance is "+balance;
        }
        else{
            throw new InsufficientFundsException("Insuffcient Balance");
        }
    }

    public String getBalance(){
        return "Your current balance is: "+balance;
    }
}
