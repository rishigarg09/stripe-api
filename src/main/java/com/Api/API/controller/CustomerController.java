package com.Api.API.controller;

import com.Api.API.model.Customer;
import com.Api.API.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class CustomerController {

    @Autowired
    private CustomerService customerService;

    // Get Customer Information

    @GetMapping("/customer")
    public List<Customer> fetchCustomers() {
        return customerService.fetchCustomers();
    }

    // Add New Customers

    @PostMapping(value = "/customer", consumes = "application/json")
    public Customer createCustomer(@RequestBody Customer customer) {
        return customerService.createCustomer(customer);
    }

    //    Get a Single Customer identified by Id

    @GetMapping("/customer/{customerId}")
    public Customer fetchCustomerById(@PathVariable(value = "id") String customerId) {
        return customerService.fetchCustomer(customerId);
    }

//    Update a given Customer's Info
//    @PutMapping(value = "/customer", consumes = "application/json")
//    public CustomerInformation updateCustomerInformation(@RequestBody CustomerInformation customerInformation) {
//        return null;
//    }

//    Delete a Customer's Information

    @DeleteMapping("customer/{customerId}")
    public Customer deleteCustomer(@PathVariable(value = "id") String customerId) {
        return customerService.deleteCustomer(customerId);
    }
}

