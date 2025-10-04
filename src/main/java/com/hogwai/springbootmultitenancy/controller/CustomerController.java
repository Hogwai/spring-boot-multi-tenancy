package com.hogwai.springbootmultitenancy.controller;

import com.hogwai.springbootmultitenancy.model.Customer;
import com.hogwai.springbootmultitenancy.service.CustomerService;
import org.springframework.http.ResponseEntity;
import org.springframework.util.StopWatch;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/customers")
public class CustomerController {
    private final CustomerService customerService;

    public CustomerController(CustomerService customerService) {
        this.customerService = customerService;
    }

    @GetMapping("/get")
    public ResponseEntity<List<Customer>> getAllCustomers() {
        StopWatch watch = new StopWatch();
        watch.start();
        List<Customer> customers = customerService.getAllCustomers();
        watch.stop();
        System.out.printf("Total time elapsed for getting all customers: %.0f %n", watch.getTotalTimeSeconds());
        return ResponseEntity.ok(customers);
    }

    @PostMapping("/create")
    public ResponseEntity<Void> insertCustomers(@RequestParam Integer customerNumber) {
        customerService.insertCustomers(customerNumber);
        return ResponseEntity.ok().build();
    }
}
