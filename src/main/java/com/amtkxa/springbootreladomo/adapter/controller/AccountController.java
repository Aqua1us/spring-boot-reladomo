package com.amtkxa.springbootreladomo.adapter.controller;

import com.amtkxa.springbootreladomo.adapter.view.TransactionView;
import com.amtkxa.springbootreladomo.usecase.web.interactor.AccountUseCaseImpl;
import com.amtkxa.springbootreladomo.adapter.view.AccountView;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
public class AccountController {

  @NonNull
  private final AccountUseCaseImpl accountUseCaseImpl;

  @GetMapping(value = "/api/account/{customerId}", produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
  public List<? extends AccountView> getAccountByCustomerId(@PathVariable("customerId") int customerId) {
    return accountUseCaseImpl.findByAccountId(customerId);
  }

  @PostMapping(value = "/api/account", produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
  public List<? extends AccountView> createAccount(@RequestBody AccountView accountView) {
    return accountUseCaseImpl.create(accountView);
  }

  @PutMapping(value = "/api/account/deposit", produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
  public List<? extends AccountView> deposit(@RequestBody TransactionView transactionView) {
    return accountUseCaseImpl.deposit(transactionView);
  }

  @DeleteMapping(value = "/api/account", produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
  public void deleteAccount(@RequestBody AccountView accountView) {
    accountUseCaseImpl.terminate(accountView);
  }
}