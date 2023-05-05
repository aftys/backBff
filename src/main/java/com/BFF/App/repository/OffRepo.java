package com.BFF.App.repository;


import com.BFF.App.model.Offre;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface OffRepo extends JpaRepository<Offre, Long>{

}