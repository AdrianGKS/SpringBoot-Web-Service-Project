package com.example.projetospringbootwebservice.repositories;

import com.example.projetospringbootwebservice.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {

}
