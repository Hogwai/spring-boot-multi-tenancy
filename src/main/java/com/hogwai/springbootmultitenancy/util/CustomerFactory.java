package com.hogwai.springbootmultitenancy.util;


import com.hogwai.springbootmultitenancy.model.Customer;

import java.util.ArrayList;
import java.util.List;

import static com.hogwai.springbootmultitenancy.util.StringUtil.generateRandomString;

public class CustomerFactory {

    private CustomerFactory() {
    }

    public static List<Customer> generateCustomers(Integer number, Integer startId) {
        java.sql.Date creationDate = new java.sql.Date(new java.util.Date().getTime());
        List<Customer> customers = new ArrayList<>(number);
        for (int i = startId; i < startId + number; i++) {
            Customer customer = Customer.builder()
                    .firstName(generateRandomString())
                    .lastName(generateRandomString())
                    .address(generateRandomString())
                    .city(generateRandomString())
                    .country(generateRandomString())
                    .creationDate(creationDate)
                    .build();
            customers.add(customer);
        }
        return customers;
    }
}
