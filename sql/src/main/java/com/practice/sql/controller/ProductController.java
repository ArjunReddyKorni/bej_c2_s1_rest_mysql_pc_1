package com.practice.sql.controller;

import com.practice.sql.domain.Product;
import com.practice.sql.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/productsData/v1/")
public class ProductController {

    ProductService productService;

    @Autowired
    public ProductController(ProductService productService) {
        this.productService = productService;
    }

    @PostMapping("/product")
    public ResponseEntity<?> addProduct(@RequestBody Product product){
        return new ResponseEntity<>(productService.addProduct(product), HttpStatus.CREATED);
    }

    @GetMapping("/products")
    public ResponseEntity<?> getAllProduct(){
        return  new ResponseEntity<>(productService.getAllProducts(),HttpStatus.OK);
    }

    @DeleteMapping("/product/{productId}")
    public ResponseEntity<?> deleteProduct(@PathVariable int productId){
        return new ResponseEntity<>(productService.deleteProductById(productId),HttpStatus.OK);
    }

    @GetMapping("/product/{productName}")
    public ResponseEntity<?>  getProductByName(@PathVariable  String productName){
        return  new ResponseEntity<>(productService.getProductByName(productName),HttpStatus.OK);
    }
}
