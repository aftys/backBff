package com.BFF.App.controller;
import com.BFF.App.model.Association;
import com.BFF.App.service.AssociationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/associations")
@CrossOrigin
public class AssociationController {

    @Autowired
    private AssociationService associationService;

    @CrossOrigin
    @GetMapping("/get-all")
    public ResponseEntity<List<Association>> getAllAssociations() {
        List<Association> associations = associationService.getAll();
        return new ResponseEntity<>(associations, HttpStatus.OK);
    }

    @CrossOrigin
    @PostMapping
    public ResponseEntity<Association> save(@RequestBody Association association) {
        Association savedAssociation = associationService.save(association);
        return new ResponseEntity<>(savedAssociation, HttpStatus.CREATED);
    }

    @CrossOrigin
    @GetMapping("/{id}")
    public ResponseEntity<Association> getById(@PathVariable("id") Long id) {
        Association association = associationService.getById(id);
        return new ResponseEntity<>(association, HttpStatus.OK);
    }
}
