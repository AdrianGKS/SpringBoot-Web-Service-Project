package com.example.projetospringbootwebservice.repositories;

import com.example.projetospringbootwebservice.entities.Order;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderRepository extends JpaRepository<Order, Long> {

}
