package com.hogwai.springbootmultitenancy.model;

import jakarta.persistence.*;
import lombok.*;

import java.util.Date;

@Entity
@AllArgsConstructor
@Builder
@Getter
@NoArgsConstructor
@Setter
public class Customer {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "cust_seq")
    @SequenceGenerator(name = "cust_seq", sequenceName = "cust_seq", allocationSize = 1)
    private Long id;
    private String firstName;
    private String lastName;
    private String country;
    private String address;
    private String city;
    private Date creationDate;
    private Date updateDate;
}