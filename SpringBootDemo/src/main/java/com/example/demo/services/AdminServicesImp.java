package com.example.demo.services;

import com.example.demo.dao.EmployeeDao;
import com.example.demo.model.Admin;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AdminServicesImp implements AdminServices{

    @Autowired
    private EmployeeDao employeeDao;

    @Override
    public void insert(Admin admin) {
        this.employeeDao.save(admin);
    }
    public Admin loginAdmin(String email, String pass){
        return employeeDao.findByEmailAndPassword(email,pass);
    }
}
