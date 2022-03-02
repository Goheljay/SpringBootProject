package com.example.demo.dao;

import com.example.demo.model.Admin;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeDao extends JpaRepository<Admin, Integer> {
    public Admin findByEmailAndPassword(String email, String pass);
}
