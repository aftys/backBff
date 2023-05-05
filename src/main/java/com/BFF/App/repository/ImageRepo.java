package com.BFF.App.repository;

import com.BFF.App.model.Image;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

public interface ImageRepo extends JpaRepository<Image, Long> {
}
