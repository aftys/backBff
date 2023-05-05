package com.BFF.App.model;

import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;


@Entity
@Table(name = "admins")
@NoArgsConstructor
@Data
public class Admin extends Utilisateur{

}
