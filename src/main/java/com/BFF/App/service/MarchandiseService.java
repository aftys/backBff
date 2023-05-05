package com.BFF.App.service;


import com.BFF.App.model.Marchandise;
import com.BFF.App.repository.MarRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MarchandiseService {

    @Autowired
    private MarRepo marchandiseRepository;

    public List<Marchandise> getAll() {
        return marchandiseRepository.findAll();
    }

    public Marchandise save(Marchandise marchandise) {
        return marchandiseRepository.save(marchandise);
    }

    public Marchandise getById(Long id) {
        return marchandiseRepository.findById(id)
                .orElseThrow(() -> new RuntimeException());
    }
}
