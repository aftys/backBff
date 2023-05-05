package com.BFF.App.model;

import java.util.List;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Table(name = "donateurs")
@Entity
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor

public class Donateur extends Utilisateur{

        @OneToMany (mappedBy = "donateur")
            private List<Offre> offres;


        private String localisation;
        private  String description;

    }

