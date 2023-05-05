package com.BFF.App.repository;


import com.BFF.App.model.Admin;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AdmRepo extends JpaRepository<Admin, Long>{

}