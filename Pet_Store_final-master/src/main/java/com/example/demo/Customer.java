package com.example.demo;


public class Customer {
    private int id;
    private String customerName;
    private String phoneNumber;


    private String petType;

    private Pet pet;

    public Customer() {
        customerName = "";
        phoneNumber = "";
        pet = new Pet();
    }

    public Customer(int id, String customerName, String phoneNumber, String petType, Pet pet) {
        this.id = id;
        this.customerName = customerName;
        this.phoneNumber = phoneNumber;
        this.petType = petType;
        this.pet = pet;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getPetType() {
        return petType;
    }

    public void setPetType(String petType) {
        this.petType = petType;
    }

    public Pet getPet() {
        return pet;
    }

    public void setPet(Pet pet) {
        this.pet = pet;
    }
}
