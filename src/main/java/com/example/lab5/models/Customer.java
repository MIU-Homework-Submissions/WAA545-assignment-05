package com.example.lab5.models;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Customer {
    @Id
    private int id;
    private String firstName;
    private String lastName;
}
