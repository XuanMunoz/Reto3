package com.g15.jpa.controller;


import com.g15.jpa.entity.Admin;
import com.g15.jpa.service.AdminService;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/Admin")
@CrossOrigin(origins = "*")

public class AdminController {
    @Autowired
    private AdminService adminService;
    @GetMapping("/all")
    public List<Admin> getCategory(){
        return adminService.getAdmin();
    }  
    
    @PostMapping("/save")
    public ResponseEntity insertClient(@RequestBody Admin admin){
        adminService.insertAdmin(admin);
        return ResponseEntity.status(201).build();
    }
}
