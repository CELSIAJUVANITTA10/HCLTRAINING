package com.homeservice;

public class Customer {
    private int customerId;
    private String name;
    private String email;
    private String location;

    public Customer(int customerId, String name, String email, String location) {
        this.customerId = customerId;
        this.name = name;
        this.email = email;
        this.location = location;
    }

    public int getCustomerId() {
        return customerId;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public String getLocation() {
        return location;
    }
}