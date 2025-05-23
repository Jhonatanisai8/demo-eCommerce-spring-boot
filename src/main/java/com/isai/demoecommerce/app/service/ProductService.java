package com.isai.demoecommerce.app.service;

import com.isai.demoecommerce.app.model.Product;

import java.util.List;
import java.util.Optional;

public interface ProductService {
    Product saveProduct(Product product);

    List<Product> getProducts();

    Optional<Product> getProduct(Integer idProduct);

    void updateProduct(Product product);

    void deleteProduct(Integer idProduct);

    List<Product> findAll();
}
