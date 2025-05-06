package com.isai.demoecommerce.app.repository;

import com.isai.demoecommerce.app.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductRepository
        extends JpaRepository<Product, Integer> {
}
