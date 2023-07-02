package com.projects.data.repositories;

import com.projects.data.entities.CompteEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CompteRepository extends JpaRepository<CompteEntity, Long> {
}
