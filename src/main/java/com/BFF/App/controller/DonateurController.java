package com.BFF.App.controller;
import com.BFF.App.model.Donateur;
import com.BFF.App.service.DonateurService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/donateurs")
public class DonateurController {

    @Autowired
    private DonateurService donateurService;

    @CrossOrigin
    @GetMapping
    public ResponseEntity<List<Donateur>> getAllAssociations() {
        List<Donateur> associations = donateurService.getAll();
        return new ResponseEntity<>(associations, HttpStatus.OK);
    }

    @CrossOrigin
    @PostMapping
    public ResponseEntity<Donateur> save(@RequestBody Donateur donateur) {
        Donateur savedDonateur = donateurService.save(donateur);
        return new ResponseEntity<>(savedDonateur, HttpStatus.CREATED);
    }

    @CrossOrigin
    @GetMapping("/{id}")
    public ResponseEntity<Donateur> getById(@PathVariable("id") Long id) {
        Donateur donateur = donateurService.getById(id);
        return new ResponseEntity<>(donateur, HttpStatus.OK);
    }
}
