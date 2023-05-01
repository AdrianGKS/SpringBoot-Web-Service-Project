package com.example.projetospringbootwebservice.resources;

import com.example.projetospringbootwebservice.entities.User;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/users")
public class UserResource {

    public ResponseEntity<User> findAll() {
        User u = new User(1L, "Adrian Gabriel", "adrian@gmail.com", "12345", "12345");
        return ResponseEntity.ok().body(u);
    }
}
