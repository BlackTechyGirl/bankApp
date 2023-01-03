package com.example.bankapp.data.model;

import com.example.bankapp.exception.AccountException;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AccountTest {
Account account;
    @BeforeEach
    @Test
    void setUp() {
        account = new Account();
    }
    @Test
    void testThatWeCanDepositBalance() throws AccountException {
        account.deposit(5000);
        assertEquals(5000, account.getBalance());
    }
    @Test
    void testThatWeCanWithdrawFrom() throws AccountException {
        account.deposit(5000);
        account.withdraw(500);
        assertEquals(4500, account.getBalance());
    }
    @Test
    void testThatWeCanViewAccountBalance(){
        account.viewAccountBalance();
        assertEquals(0.0, account.getBalance());
    }
}