package com.Api.API.repository;

import com.Api.API.model.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface CustomerRepository extends JpaRepository<Customer, String> {
    List<Customer> fetchCustomers();

    Customer fetchCustomer(String id);

    Customer createCustomer(Customer customer);

    Customer deleteCustomer(Customer customer);

}
