package com.example.bankapp.data.repository;

import com.example.bankapp.data.model.Account;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BankRepoImplTest {
BankRepository bankRepository;
    @BeforeEach
    @Test
    void setUp() {
        bankRepository =new BankRepoImpl();
    }
    @Test
    public void testWeCanCreateAndSaveAccount(){
        Account account = new Account();
        bankRepository.saveAccount(account);
        assertEquals(1, bankRepository.countAccount());

    }
}