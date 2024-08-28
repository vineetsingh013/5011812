package com.example.BookstoreAPI.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.BookstoreAPI.entity.Customer;
import com.example.BookstoreAPI.service.CustomerService;

@RestController
public class RegistrationController {
    @Autowired
    private CustomerService customerService;
    @PostMapping("/api/customers/register")
    public void registerCustomer(@RequestBody Customer customer){
        customerService.save(customer);
    }
}
