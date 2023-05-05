package com.BFF.App.service;


import com.BFF.App.model.Offre;
import com.BFF.App.repository.OffRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class OffreService {

    @Autowired
    private OffRepo offreRepository;

    public List<Offre> getAll() {
        return offreRepository.findAll();
    }

    public Offre save(Offre offre) {
        return offreRepository.save(offre);
    }

    public Offre getById(Long id) {
        return offreRepository.findById(id)
                .orElseThrow(() -> new RuntimeException());
    }
}
