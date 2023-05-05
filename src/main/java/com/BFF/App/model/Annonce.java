package com.BFF.App.model;

import java.util.Date;
import java.util.List;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Table(name = "annonces")
@Entity
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor

public class Annonce {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    private Association association;

    @OneToMany (mappedBy = "annonce")
    private List<Marchandise> marchandises;

    @OneToMany (mappedBy = "annonce")
    private List<Offre> offres;

    private String titre;
    private Date dateDebut;
    private Date dateFin;
    private String status;
    private String description;

}

