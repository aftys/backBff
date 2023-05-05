package com.BFF.App.service;


import com.BFF.App.model.Donateur;
import com.BFF.App.repository.DonRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DonateurService {

    @Autowired
    private DonRepo donateurRepository;

    public List<Donateur> getAll() {
        return donateurRepository.findAll();
    }

    public Donateur save(Donateur donateur) {
        return donateurRepository.save(donateur);
    }

    public Donateur getById(Long id) {
        return donateurRepository.findById(id)
                .orElseThrow(() -> new RuntimeException());
    }
}
