package com.hogwai.springbootmultitenancy.repository;


import com.hogwai.springbootmultitenancy.model.Customer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CustomerRepository extends JpaRepository<Customer, Long> {
}
