package com.example.lab5.models;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

import java.util.Date;

@Entity(name = "orders")
public class Order {
    @Id
    private int orderId;
    private Date date;
}
