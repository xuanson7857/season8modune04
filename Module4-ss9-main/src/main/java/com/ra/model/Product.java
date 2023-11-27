package com.ra.model;

public class Product {
    int id;
    String name;
    String description;
    boolean status;
    int quantity;
    float price;

    public Product() {
    }

    public Product(int id, String name, String description, boolean status, int quantity, float price) {
        this.id = id;
        this.name = name;
        this.description = description;
        this.status = status;
        this.quantity = quantity;
        this.price = price;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }
}
