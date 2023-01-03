package com.example.bankapp.exception;

public class AccountException extends Exception {
    private String message;

    public AccountException(String message){
        super(message);
    }
}
