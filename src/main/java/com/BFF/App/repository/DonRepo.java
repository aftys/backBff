package com.BFF.App.repository;


import com.BFF.App.model.Donateur;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DonRepo extends JpaRepository<Donateur, Long>{

}