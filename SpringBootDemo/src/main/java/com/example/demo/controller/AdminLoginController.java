package com.example.demo.controller;

import com.example.demo.model.Admin;
import com.example.demo.services.AdminServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import java.util.Objects;

@Controller
public class AdminLoginController {

//	@RequestMapping({"/","/hello"})
//	public String home() {
//		return "home";
//	}

    @Autowired
    private AdminServices adminServices;

    @RequestMapping(value = {"/", "/hello"}, method = RequestMethod.GET)
    public ModelAndView testing(Model model) {
        System.out.println("page running..");
//        Admin admin = new Admin();
//        model.addAttribute("user", admin);
        return new ModelAndView("home");
    }

//    @RequestMapping(value = "/adminLogin", method = RequestMethod.POST)
//    public ModelAndView login(@RequestParam("adminEmail") String email, @RequestParam("adminPassword") String password) {
//
//        System.out.printf(email);
//        System.out.println(password);
//
//        Admin admin = new Admin();
//        admin.setEmail(email);
//        admin.setPassword(password);
//        this.adminServices.insert(admin);
//
//        return new ModelAndView("Dashboard");
//    }

   @PostMapping(value =  "/adminLogin")
    public ModelAndView loginAdminEmailandPass(@RequestParam("adminEmail") String email, @RequestParam("adminPassword") String password){
        Admin oauth = adminServices.loginAdmin(email, password);
        System.out.println(oauth.toString());

        if (Objects.nonNull(oauth)){
            return new ModelAndView("Dashboard");
        }else{
            return new ModelAndView("home");
        }
    }
}
