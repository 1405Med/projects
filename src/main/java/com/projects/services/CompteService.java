package com.projects.services;

import com.projects.dtos.CompteDto;
import com.projects.dtos.ProjectDto;

import java.util.List;

public interface CompteService {

    void createCompte(CompteDto dto);

    void updateCompte(Long id, CompteDto dto);

    void deleteCompte(Long id);

   CompteDto getCompte(Long id);

    List<CompteDto> readAll();
}
