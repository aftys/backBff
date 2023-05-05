package com.BFF.App.service;


import com.BFF.App.model.Admin;
import com.BFF.App.repository.AdmRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AdminService {

    @Autowired
    private AdmRepo adminRepository;

    public List<Admin> getAll() {
        return adminRepository.findAll();
    }

    public Admin save(Admin donateur) {
        return adminRepository.save(donateur);
    }

    public Admin getById(Long id) {
        return adminRepository.findById(id)
                .orElseThrow(() -> new RuntimeException());
    }
}
