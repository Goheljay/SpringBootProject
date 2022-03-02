package com.example.foodorder.dao;

import com.example.foodorder.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserDao extends JpaRepository<User, Integer> {
}
