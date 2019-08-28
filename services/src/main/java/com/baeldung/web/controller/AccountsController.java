package com.baeldung.web.controller;

import com.baeldung.web.dto.Account;
import com.baeldung.web.dto.Bar;
import com.baeldung.web.dto.Client;
import org.springframework.http.HttpStatus;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

import static org.apache.commons.lang3.RandomStringUtils.randomAlphabetic;
import static org.apache.commons.lang3.RandomStringUtils.randomNumeric;

@Controller
public class AccountsController {

    public AccountsController() {
        super();
    }

    // API - read
    @PreAuthorize("#oauth2.hasScope('api') and #oauth2.hasScope('read')")
    @RequestMapping(method = RequestMethod.GET, value = "/account/{id}")
    @ResponseBody
    public Bar findById(@PathVariable final long id) {
        return new Bar(Long.parseLong(randomNumeric(2)), randomAlphabetic(4));
    }

    @PreAuthorize("#oauth2.hasScope('api') and #oauth2.hasScope('read')")
    @RequestMapping(method = RequestMethod.GET, value = "/accounts")
    @ResponseBody
    public Client findAll() {
        ArrayList<Account> accounts = new ArrayList<>();
        accounts.add(new Account(5000,"USD", 111111));
        accounts.add(new Account(1000,"USD", 121212));
        accounts.add(new Account(2000,"USD", 151515));
        return new Client("Jose Maldonado", 1, accounts);
    }

    // API - write
    @PreAuthorize("#oauth2.hasScope('api') and #oauth2.hasScope('write') and hasRole('ROLE_ADMIN')")
    @RequestMapping(method = RequestMethod.POST, value = "/accounts")
    @ResponseStatus(HttpStatus.CREATED)
    @ResponseBody
    public Bar create(@RequestBody final Bar bar) {
        bar.setId(Long.parseLong(randomNumeric(2)));
        return bar;
    }

}
