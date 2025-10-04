package com.hogwai.springbootmultitenancy.service;


import com.hogwai.springbootmultitenancy.model.Customer;
import com.hogwai.springbootmultitenancy.record.CustomerRecord;

import java.util.List;

public interface CustomerService {
    List<Customer> getAllCustomers();

    void insertCustomers(Integer customerNumber);
}
