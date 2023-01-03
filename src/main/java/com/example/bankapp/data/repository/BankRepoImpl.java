package com.example.bankapp.data.repository;

import com.example.bankapp.data.model.Account;

import java.util.HashMap;

public class BankRepoImpl implements BankRepository{
    HashMap <String, Account> myAccountsList = new HashMap<String, Account>();


    @Override
    public void saveAccount(Account account) {
        myAccountsList.put(account.getName(), account);
    }

    @Override
    public int countAccount() {
        return myAccountsList.size();
    }
}
