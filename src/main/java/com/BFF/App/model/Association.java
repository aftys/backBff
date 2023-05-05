package com.BFF.App.model;


import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;
import java.util.*;


@Entity
@Table(name = "associations")
@NoArgsConstructor
@Data
public class Association extends Utilisateur{

        private String organisme;


        @Column(name = "description")
        private String description;

        @Column(name = "localisation")
        private String localisation;


        @OneToMany(mappedBy = "association", cascade = CascadeType.ALL)
        @JsonIgnore
        private List<Annonce> annonces = new ArrayList<>();

}

