package com.BFF.App.repository;


import com.BFF.App.model.Annonce;
import com.BFF.App.model.Association;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;


@Repository
public interface AnoRepo extends JpaRepository<Annonce, Long>{
    List<Annonce> findAll();
    List<Annonce> findByAssociation(Association asc);

}


