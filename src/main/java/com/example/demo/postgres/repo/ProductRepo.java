package com.example.demo.postgres.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.postgres.model.Product;

public interface ProductRepo extends JpaRepository<Product, Integer>{

}
