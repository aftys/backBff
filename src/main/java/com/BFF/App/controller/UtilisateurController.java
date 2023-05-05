package com.BFF.App.controller;
import com.BFF.App.model.Image;
import com.BFF.App.model.Utilisateur;


import com.BFF.App.repository.ImageRepo;
import com.BFF.App.service.UtilisateurService;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.util.List;

@RestController
@RequestMapping("/users")
@CrossOrigin
public class UtilisateurController {


    @Autowired
    private UtilisateurService utilisateurService;

    @CrossOrigin
    @GetMapping("")
    public ResponseEntity<List<Utilisateur>> getAllAssociations() {
        List<Utilisateur> utilisateurs = utilisateurService.getAll();
        return new ResponseEntity<>(utilisateurs, HttpStatus.OK);
    }



    @CrossOrigin
    @GetMapping("/{id}")
    public ResponseEntity<Utilisateur> getById(@PathVariable("id") Long id) {
        Utilisateur user = utilisateurService.getById(id);
        return new ResponseEntity<>(user, HttpStatus.OK);
    }
}

