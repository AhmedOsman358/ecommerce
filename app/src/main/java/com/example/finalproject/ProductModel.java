package com.example.finalproject;

public class ProductModel {
    private String title;
    private String details;
    private String price;
    private String image;

    public ProductModel(String title, String details, String price) {
        this.title = title;
        this.details = details;
        this.price = price;
    }

    public static void add(ProductModel model1) {
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDetails() {
        return details;
    }

    public void setDetails(String details) {
        this.details = details;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }
}
