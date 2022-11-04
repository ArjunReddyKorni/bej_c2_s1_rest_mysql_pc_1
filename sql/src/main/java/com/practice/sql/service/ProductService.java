package com.practice.sql.service;

import com.practice.sql.domain.Product;

import java.util.List;

public interface ProductService {

    Product addProduct(Product product);
    List<Product> getAllProducts();
    boolean deleteProductById(int productId);

    List<Product> getProductByName(String productName);


}
