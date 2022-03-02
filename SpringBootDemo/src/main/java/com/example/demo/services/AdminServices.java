package com.example.demo.services;

import com.example.demo.model.Admin;

public interface AdminServices {
    void insert(Admin admin);
    public Admin loginAdmin(String email, String pass);

}
