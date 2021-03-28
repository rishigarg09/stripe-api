package com.Api.API;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication(
        scanBasePackages = {
                "com.Api.API.model.Customer",
                "com.Api.API.entity.CustomerEntity",
                "com.Api.API.service.CustomerService",
                "com.Api.API.repository.CustomerRepository",
                "com.Api.API.controller.CustomerController"
        })
public class ApiApplication {

    public static void main(String[] args) {
        SpringApplication.run(ApiApplication.class, args);
    }
}
