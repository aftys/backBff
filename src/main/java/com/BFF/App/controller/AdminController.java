package com.BFF.App.controller;
import com.BFF.App.model.Admin;
import com.BFF.App.service.AdminService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/admin")
public class AdminController {

    @Autowired
    private AdminService adminService;

    @CrossOrigin
    @GetMapping
    public ResponseEntity<List<Admin>> getAllAssociations() {
        List<Admin> admin = adminService.getAll();
        return new ResponseEntity<>(admin, HttpStatus.OK);
    }

    @CrossOrigin
    @PostMapping
    public ResponseEntity<Admin> save(@RequestBody Admin admin) {
        Admin savedAdmin = adminService.save(admin);
        return new ResponseEntity<>(savedAdmin, HttpStatus.CREATED);
    }

    @CrossOrigin
    @GetMapping("/{id}")
    public ResponseEntity<Admin> getById(@PathVariable("id") Long id) {
        Admin admin = adminService.getById(id);
        return new ResponseEntity<>(admin, HttpStatus.OK);
    }
}
