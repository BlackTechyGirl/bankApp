package com.example.bankapp.data.repository;

import com.example.bankapp.data.model.Account;
import org.apache.tomcat.util.http.parser.AcceptEncoding;

public interface BankRepository {
    void saveAccount(Account account);

    int countAccount();
}
