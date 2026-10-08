package com.homeservice;

public class Main {
    public static void main(String[] args) {
        Customer customer = new Customer(1, "Celsia", "celsia@gmail.com", "Salem");

        System.out.println("Home Service Marketplace");
        System.out.println("------------------------");
        System.out.println("Customer ID: " + customer.getCustomerId());
        System.out.println("Name: " + customer.getName());
        System.out.println("Email: " + customer.getEmail());
        System.out.println("Location: " + customer.getLocation());
    }
}