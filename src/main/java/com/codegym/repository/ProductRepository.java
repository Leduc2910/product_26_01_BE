package com.codegym.repository;

import com.codegym.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ProductRepository extends JpaRepository<Product, Long> {
    List<Product> findAllByNameContaining(String name);
    List<Product> findAllByPriceBetween(int minPrice, int maxPrice);
    List<Product> findAllByCategoryId(Long id);
}
