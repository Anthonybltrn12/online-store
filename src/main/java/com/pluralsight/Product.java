package com.pluralsight;

public class Product {
    private String sku;
    private String name;
    private double price;
    private String category;

    public Product(String sku, String name, double price, String category){
        this.sku = sku;
        this.name = name;
        this.price = price;
        this.category = category;
    }

    public void setSku(String sku) {
        this.sku = sku;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getSku() {
        return sku;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public String getCategory() {
        return category;
    }
}
