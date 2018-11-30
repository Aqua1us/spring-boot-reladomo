package com.amtkxa.springbootreladomo.Interface.controller;

import com.amtkxa.springbootreladomo.usecase.service.impl.CustomerServiceImpl;
import com.amtkxa.springbootreladomo.usecase.view.CustomerView;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequiredArgsConstructor
public class CustomerController {

  @NonNull private final CustomerServiceImpl customerServiceImpl;

  @GetMapping(value = "/api/customer", produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
  public List<? extends CustomerView> getCustomerAll() {
    return customerServiceImpl.findAll();
  }

  @GetMapping(value = "/api/customer/{customerId}", produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
  public List<? extends CustomerView> getCustomerById(@PathVariable("customerId") int customerId) {
    return customerServiceImpl.findByCustomerId(customerId);
  }
}
