package com.example.projetospringbootwebservice.repositories;

import com.example.projetospringbootwebservice.entities.Category;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoryRepository extends JpaRepository<Category, Long> {

}
