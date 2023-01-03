package com.example.bankapp.data.model;

import com.example.bankapp.exception.AccountException;
import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@RequiredArgsConstructor

public class Account {

    @NonNull
    private String name;
    private int age;
    @NonNull
    private double balance;


    public void deposit(double amountDeposit) throws AccountException {
        if (amountDeposit < 0) throw new AccountException
                ("Sorry you dont have enough money to deposit");
        this.balance = amountDeposit;
    }

    public void withdraw(double withdrawAmount) throws AccountException {
        if (withdrawAmount < 0 || withdrawAmount > balance)
            throw new AccountException("Invalid withdraw amount");
        this.balance -= withdrawAmount;
    }

    public double viewAccountBalance() {
        return this.balance;
    }
}
