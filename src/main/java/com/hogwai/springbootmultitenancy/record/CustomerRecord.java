package com.hogwai.springbootmultitenancy.record;

import com.hogwai.springbootmultitenancy.model.Customer;
import lombok.Builder;

import java.util.Date;

@Builder
public record CustomerRecord(String firstName,
                             String lastName,
                             String country,
                             String address,
                             String city,
                             Date creationDate,
                             Date updateDate,
                             String stores) {
    public static CustomerRecord toRecord(Customer customer) {
        return CustomerRecord.builder()
                .firstName(customer.getFirstName())
                .lastName(customer.getLastName())
                .address(customer.getAddress())
                .city(customer.getCity())
                .creationDate(customer.getCreationDate())
                .updateDate(customer.getUpdateDate())
                .build();
    }
}
