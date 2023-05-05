package com.BFF.App.controller;
import com.BFF.App.model.Marchandise;
import com.BFF.App.service.MarchandiseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/marchandises")
public class MarchandiseController {

    @Autowired
    private MarchandiseService marchandiseService;

    @CrossOrigin
    @GetMapping
    public ResponseEntity<List<Marchandise>> getAllAssociations() {
        List<Marchandise> associations = marchandiseService.getAll();
        return new ResponseEntity<>(associations, HttpStatus.OK);
    }

    @CrossOrigin
    @PostMapping
    public ResponseEntity<Marchandise> save(@RequestBody Marchandise marchandise) {
        Marchandise savedMarchandise = marchandiseService.save(marchandise);
        return new ResponseEntity<>(savedMarchandise, HttpStatus.CREATED);
    }

    @CrossOrigin
    @GetMapping("/{id}")
    public ResponseEntity<Marchandise> getById(@PathVariable("id") Long id) {
        Marchandise marchandise = marchandiseService.getById(id);
        return new ResponseEntity<>(marchandise, HttpStatus.OK);
    }
}

