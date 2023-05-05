package com.BFF.App.repository;


import com.BFF.App.model.Association;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AscRepo extends JpaRepository<Association, Long>{

}


