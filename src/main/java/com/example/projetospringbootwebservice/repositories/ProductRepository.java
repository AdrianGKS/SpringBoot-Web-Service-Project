package com.example.projetospringbootwebservice.repositories;

import com.example.projetospringbootwebservice.entities.Category;
import com.example.projetospringbootwebservice.entities.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Long> {

}
