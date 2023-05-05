package com.BFF.App.model;

import java.util.Date;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Table(name = "offres")
@Entity
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor

public class Offre {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    private Annonce annonce;

    @ManyToOne
    private Donateur donateur;

    private Date date;
    private String status;

}