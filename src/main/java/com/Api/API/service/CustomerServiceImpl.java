package com.Api.API.service;

import com.Api.API.model.Customer;
import com.Api.API.repository.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CustomerServiceImpl implements CustomerService {

    @Autowired
    private CustomerRepository customerRepository;

    @Override
    public List<Customer> fetchCustomers() {
        return customerRepository.fetchCustomers();
    }

    @Override
    public Customer fetchCustomer(String customerId) {
        Customer customer = customerRepository.fetchCustomer(customerId);
        return customer;
    }

    @Override
    public Customer createCustomer(Customer customer) {
         return customerRepository.createCustomer(customer);
    }

    @Override
    public Customer deleteCustomer(String customerId) {
        Optional<Customer> customer = customerRepository.findById(customerId);
        if (customer.isPresent()) {
            customerRepository.deleteCustomer(customer.get());
        }
        return customer.get();
    }

}
