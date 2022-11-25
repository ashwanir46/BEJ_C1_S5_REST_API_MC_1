package com.example.demo.service;

import com.example.demo.domain.Product;

import java.util.List;

public interface IProductService {
    public Product saveProduct(Product product);

    public List<Product> getAllProduct();
}
