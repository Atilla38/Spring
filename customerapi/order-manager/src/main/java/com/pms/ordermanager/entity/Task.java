package com.pms.ordermanager.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Task {

    public Task(String resource, int amount) {
        this.resource = resource;
        this.amount = amount;
    }

    @Id 
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String resource;

    private int amount;

    public Long getId() {
        return this.id;
    }

    public String resource() {
        return this.resource;
    }

    public int getAmount() {
        return this.amount;
    }
}
