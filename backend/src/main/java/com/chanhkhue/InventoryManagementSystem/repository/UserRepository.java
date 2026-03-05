package com.chanhkhue.InventoryManagementSystem.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.chanhkhue.InventoryManagementSystem.models.User;

public interface UserRepository extends JpaRepository<User , Long>{
  Optional <User> findByEmail(String email);
} 
