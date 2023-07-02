package com.projects.services.impl;

import com.projects.data.repositories.CompteRepository;
import com.projects.data.repositories.ProjectRepository;
import com.projects.dtos.CompteDto;
import com.projects.dtos.ProjectDto;
import com.projects.mappers.CompteMapper;
import com.projects.mappers.ProjectMapper;
import com.projects.services.CompteService;
import com.projects.services.ProjectService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class CompteServiceImpl implements CompteService {

    private final CompteRepository compteRepository;
    private final CompteMapper compteMapper;

    @Autowired
    public CompteServiceImpl(CompteRepository compteRepository, CompteMapper compteMapper) {
        this.compteRepository = compteRepository;
        this.compteMapper = compteMapper;
    }

    public void createCompte(CompteDto dto) {
        compteRepository.save(compteMapper.compteDtoToEntity(dto));

    }

    public void updateCompte(Long id, CompteDto dto) {
        compteRepository.findById(id).ifPresent(
                compte -> {
                    compte.setName(dto.getName());
                    compteRepository.save(compte);
                }
        );

    }

    public void deleteCompte(Long id) {
        compteRepository.findById(id)
                .ifPresent(compte -> compteRepository.deleteById(id));

    }

    public CompteDto getCompte(Long id) {

        return compteMapper.compteToDto(compteRepository.getReferenceById(id));
    }

    @Override
    public List<CompteDto> readAll() {
        return compteRepository.findAll()
                .stream()
                .map(compteMapper::compteToDto)
                .collect(Collectors.toList());
    }
}
