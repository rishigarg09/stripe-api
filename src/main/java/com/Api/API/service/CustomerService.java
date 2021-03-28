package com.Api.API.service;

import com.Api.API.model.Customer;

import java.util.List;

public interface CustomerService {

    public List<Customer> fetchCustomers();
    public Customer fetchCustomer(String id);
    public Customer createCustomer(Customer customer);
    public Customer deleteCustomer(String customerId);
}
