package com.example.demo.model;

import javax.persistence.*;

@Entity
@Table(name = "Admin_Table")
public class Admin {
    @Id
    @Column(name = "admin_email")
    private String email;
    @Column(name = "admin_password")
    private String password;

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
