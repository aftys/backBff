package com.BFF.App.model;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Table(name = "marchandises")
@Entity
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor

public class Marchandise {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    private Annonce annonce;

    private String nom;
    private Long quantitemax;
    private Long quantitecourant;
    private String type;

}