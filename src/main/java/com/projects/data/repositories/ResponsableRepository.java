package com.projects.data.repositories;

import com.projects.data.entities.ProjectEntity;
import com.projects.data.entities.ResponsableEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ResponsableRepository extends JpaRepository<ResponsableEntity, Long> {
}
