package com.example.projetospringbootwebservice.repositories;

import com.example.projetospringbootwebservice.entities.OrderItem;
import com.example.projetospringbootwebservice.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderItemRepository extends JpaRepository<OrderItem, Long> {

}
