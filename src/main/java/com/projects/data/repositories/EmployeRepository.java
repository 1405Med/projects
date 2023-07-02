package com.projects.data.repositories;

import com.projects.data.entities.EmployeEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeRepository extends JpaRepository<EmployeEntity, Long> {

}
