package com.projects.services.impl;

import com.projects.data.repositories.ResponsableRepository;
import com.projects.dtos.ProjectDto;
import com.projects.dtos.ResponsableDto;
import com.projects.mappers.ResponsableMapper;
import com.projects.services.ResponsableService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class ResponsableServiceImpl implements ResponsableService {

    private final ResponsableRepository responsableRepository;
    private final ResponsableMapper responsableMapper;

    @Autowired
    public ResponsableServiceImpl(ResponsableRepository responsableRepository, ResponsableMapper responsableMapper) {
        this.responsableRepository = responsableRepository;
        this.responsableMapper = responsableMapper;
    }

    public void createResponsable(ResponsableDto dto) {
        responsableRepository.save(responsableMapper.responsableDtoToEntity(dto));

    }

    public void updateResponsable(Long id, ResponsableDto dto) {
        responsableRepository.findById(id).ifPresent(
                responsable -> {
                    responsable.setName(dto.getName());
                    responsableRepository.save(responsable);
                }
        );

    }

    public void deleteResponsable(Long id) {
        responsableRepository.findById(id)
                .ifPresent(responsable -> responsableRepository.deleteById(id));

    }

    public ResponsableDto getResponsable(Long id) {
        return responsableMapper.responsableToDto(responsableRepository.getReferenceById(id));
    }

    @Override
    public List<ResponsableDto> readAll() {
        return responsableRepository.findAll()
                .stream()
                .map(responsableMapper::responsableToDto)
                .collect(Collectors.toList());
    }
}
