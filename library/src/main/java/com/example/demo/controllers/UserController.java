package com.example.demo.controllers;


import com.example.demo.services.AdminService;
import com.example.demo.services.UserService;
import com.example.demo.util.UserValidator;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;






@Controller
public class UserController {

    private final AdminService adminService;


    @Autowired
    public UserController(AdminService adminService, UserService userService, UserValidator userValidator) {
        this.adminService = adminService;

    }
}
