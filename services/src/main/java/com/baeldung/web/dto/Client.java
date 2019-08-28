package com.baeldung.web.dto;

import java.util.ArrayList;

public class Client {

    private String name;
    private long client;
    private ArrayList<Account> accounts;

    public Client(String name, long client, ArrayList<Account> accounts) {
        this.name = name;
        this.client = client;
        this.accounts = accounts;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public long getClient() {
        return client;
    }

    public void setClient(long client) {
        this.client = client;
    }

    public ArrayList<Account> getAccounts() {
        return accounts;
    }

    public void setAccounts(ArrayList<Account> accounts) {
        this.accounts = accounts;
    }
}
