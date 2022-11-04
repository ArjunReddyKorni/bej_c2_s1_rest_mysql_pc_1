package com.practice.sql.domain;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="produtsTable")
public class Product {

    @Id
    private int productId;
    private String productName;
    private String productDiscription;
    private int amountInStock;

    public Product(int productId, String productName, String productDiscription, int amountInStock) {
        this.productId = productId;
        this.productName = productName;
        this.productDiscription = productDiscription;
        this.amountInStock = amountInStock;
    }

    public Product() {
    }

    public int getProductId() {
        return productId;
    }

    public void setProductId(int productId) {
        this.productId = productId;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public String getProductDiscription() {
        return productDiscription;
    }

    public void setProductDiscription(String productDiscription) {
        this.productDiscription = productDiscription;
    }

    public int getAmountInStock() {
        return amountInStock;
    }

    public void setAmountInStock(int amountInStock) {
        this.amountInStock = amountInStock;
    }

    @Override
    public String toString() {
        return "Product{" +
                "productId=" + productId +
                ", productName='" + productName + '\'' +
                ", productDiscription='" + productDiscription + '\'' +
                ", amountInStock=" + amountInStock +
                '}';
    }
}
