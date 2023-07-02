package com.projects.services;

import com.projects.dtos.CompteDto;
import com.projects.dtos.ContratDto;

import java.util.List;

public interface ContratService {

    void createContrat(ContratDto dto);

    void updateContrat(Long id, ContratDto dto);

    void deleteContrat(Long id);

   ContratDto getContrat(Long id);

    List<ContratDto> readAll();
}
