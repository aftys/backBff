package com.BFF.App.controller;
import com.BFF.App.model.Offre;
import com.BFF.App.service.OffreService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/offres")
public class OffreController {

    @Autowired
    private OffreService offreService;

    @CrossOrigin
    @GetMapping
    public ResponseEntity<List<Offre>> getAllAssociations() {
        List<Offre> offres = offreService.getAll();
        return new ResponseEntity<>(offres, HttpStatus.OK);
    }

    @CrossOrigin
    @PostMapping
    public ResponseEntity<Offre> save(@RequestBody Offre offre) {
        Offre savedOffre = offreService.save(offre);
        return new ResponseEntity<>(savedOffre, HttpStatus.CREATED);
    }

    @CrossOrigin
    @GetMapping("/{id}")
    public ResponseEntity<Offre> getById(@PathVariable("id") Long id) {
        Offre offre = offreService.getById(id);
        return new ResponseEntity<>(offre, HttpStatus.OK);
    }
}

