package com.example;

public class InsufficientFundsException extends Exception{
    String message;

    InsufficientFundsException(String message){
        this.message = message;
    }    
}
