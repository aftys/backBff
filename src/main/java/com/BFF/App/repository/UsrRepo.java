package com.BFF.App.repository;


import com.BFF.App.model.Utilisateur;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UsrRepo extends JpaRepository<Utilisateur, Long>{

}