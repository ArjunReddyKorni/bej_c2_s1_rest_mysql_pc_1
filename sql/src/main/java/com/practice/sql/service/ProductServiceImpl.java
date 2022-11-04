package com.practice.sql.service;

import com.practice.sql.domain.Product;
import com.practice.sql.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductServiceImpl implements  ProductService{
    ProductRepository productRepository;

    @Autowired
    public ProductServiceImpl(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }

    @Override
    public Product addProduct(Product product) {
        return productRepository.save(product);
    }

    @Override
    public List<Product> getAllProducts() {
        return productRepository.findAll();
    }

    @Override
    public boolean deleteProductById(int productId) {
       productRepository.deleteById(productId);
        return true;
    }

    @Override
    public List<Product> getProductByName(String productName) {
        return productRepository.findByProductName(productName);
    }


}
