package Prace_Domowe.Taka_Duza.model;

import java.util.Optional;

public class Product {
    private String name;
    public String category;
    public double price;
    public double rating;
    public boolean inStock;
    public Optional<String> manufacturer;

    public Product() {

    }

    public Product(String name, String category, double price, double rating, Optional<String> manufacturer ,boolean inStock) {
        this.name = name;
        this.category = category;
        this.price = price;
        this.rating = rating;
        this.inStock = inStock;
        this.manufacturer = manufacturer;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public double getRating() {
        return rating;
    }

    public void setRating(double rating) {
        this.rating = rating;
    }

    public boolean isInStock() {
        return inStock;
    }

    public void setInStock(boolean inStock) {
        this.inStock = inStock;
    }

    public Optional<String> getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(Optional<String> manufacturer) {
        this.manufacturer = manufacturer;
    }
}
