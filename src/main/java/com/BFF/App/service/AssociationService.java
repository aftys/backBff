package com.BFF.App.service;


import com.BFF.App.model.Annonce;
import com.BFF.App.model.Association;
import com.BFF.App.repository.AscRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AssociationService {

    @Autowired
    private AscRepo associationRepository;

    public List<Association> getAll() {
        return associationRepository.findAll();
    }


    public Association save(Association association) {
        return associationRepository.save(association);
    }

    public List<Annonce> getAnnonce(Long id){ return getById(id).getAnnonces();}

    public Association getById(Long id) {
        return associationRepository.findById(id)
                .orElseThrow(() -> new RuntimeException());
    }
}
