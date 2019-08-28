package com.baeldung.web.dto;

public class Account {

    private double balance;
    private String currency;
    private long account_number;

    public Account(double balance, String currency, long account_number) {
        this.balance = balance;
        this.currency = currency;
        this.account_number = account_number;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public String getCurrency() {
        return currency;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }

    public long getAccount_number() {
        return account_number;
    }

    public void setAccount_number(long account_number) {
        this.account_number = account_number;
    }
}
