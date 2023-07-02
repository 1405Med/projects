package com.projects.data.repositories;

import com.projects.data.entities.CompteEntity;
import com.projects.data.entities.TacheEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TacheRepository extends JpaRepository<TacheEntity, Long> {
}
