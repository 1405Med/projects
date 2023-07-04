package com.projects.services.impl;

import com.projects.data.repositories.CompteRepository;
import com.projects.data.repositories.ContratRepository;
import com.projects.dtos.CompteDto;
import com.projects.dtos.ContratDto;
import com.projects.mappers.CompteMapper;
import com.projects.mappers.ContratMapper;
import com.projects.services.CompteService;
import com.projects.services.ContratService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class ContratServiceImpl implements ContratService {

    private final ContratRepository contratRepository;
    private final ContratMapper contratMapper;

    @Autowired
    public ContratServiceImpl(ContratRepository contratRepository, ContratMapper contratMapper) {
        this.contratRepository = contratRepository;
        this.contratMapper = contratMapper;
    }

    public void createContrat(ContratDto dto) {
        contratRepository.save(contratMapper.contratDtoToEntity(dto));

    }

    @Override
    public void updateContrat(Long id, ContratDto dto) {
        
    }

    public void updateContrat(Long id, CompteDto dto) {
        contratRepository.findById(id).ifPresent(
                contrat -> {
                    contrat.setName(dto.getName());
                    contratRepository.save(contrat);
                }
        );

    }

    public void deleteContrat(Long id) {
        contratRepository.findById(id)
                .ifPresent(contrat -> contratRepository.deleteById(id));

    }

    public ContratDto getContrat(Long id) {

        return contratMapper.contraToDto(contratRepository.getReferenceById(id));
    }

    @Override
    public List<ContratDto> readAll() {
        return contratRepository.findAll()
                .stream()
                .map(contratMapper::contraToDto)
                .collect(Collectors.toList());
    }
}
