package com.BFF.App.controller;
import com.BFF.App.model.Annonce;
import com.BFF.App.model.Association;
import com.BFF.App.service.AnnonceService;
import com.BFF.App.service.AssociationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;


import java.util.List;

@RestController
@RequestMapping("/annonces")
@CrossOrigin
public class AnnonceController {

    @Autowired
    private AnnonceService annonceService;

    @Autowired
    private AssociationService associationService;


    @CrossOrigin
    @GetMapping
    public ResponseEntity<List<Annonce>> getAllAssociations() {
        List<Annonce> associations = annonceService.getAll();
        return new ResponseEntity<>(associations, HttpStatus.OK);
    }

    @CrossOrigin
    @PostMapping
    public ResponseEntity<Annonce> save(@RequestBody Annonce annonce) {
        Association asc=associationService.getById((annonce.getAssociation())
                .getId());
        annonce.setAssociation(asc);

        return new ResponseEntity<>(annonce, HttpStatus.CREATED);
    }

    @CrossOrigin
    @GetMapping("/{id}")
    public ResponseEntity<Annonce> getById(@PathVariable("id") Long id) {
        Annonce annonce = annonceService.getById(id);
        return new ResponseEntity<>(annonce, HttpStatus.OK);
    }

    @CrossOrigin
    @GetMapping("/association/{id}")
    public List<Annonce> getByAsc(@PathVariable("id") Long id) {
        Association asc= associationService.getById(id);
        return annonceService.getByAssociation(asc);
    }




}
