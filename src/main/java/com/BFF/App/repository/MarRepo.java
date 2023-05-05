package com.BFF.App.repository;

import com.BFF.App.model.Marchandise;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface MarRepo extends JpaRepository<Marchandise, Long>{

}