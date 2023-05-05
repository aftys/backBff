package com.BFF.App.service;


import com.BFF.App.model.Annonce;
import com.BFF.App.model.Association;
import com.BFF.App.repository.AnoRepo;
import com.BFF.App.repository.AscRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AnnonceService {

    @Autowired
    private AnoRepo annonceRepository;
    @Autowired
    private AscRepo associationRepository;

    public List<Annonce> getAll() {
        return annonceRepository.findAll();
    }

    public Annonce save(Annonce donateur) {
        return annonceRepository.save(donateur);
    }


    public Annonce getById(Long id) {
        return annonceRepository.findById(id)
                .orElseThrow(() -> new RuntimeException());
    }
    public List<Annonce> getByAssociation(Association asc) {
        return annonceRepository.findByAssociation(asc);
    }
}
