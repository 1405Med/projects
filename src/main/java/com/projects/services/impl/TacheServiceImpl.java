package com.projects.services.impl;

import com.projects.data.repositories.TacheRepository;
import com.projects.data.repositories.UserRepository;
import com.projects.dtos.TacheDto;
import com.projects.dtos.UserDto;
import com.projects.mappers.TacheMapper;
import com.projects.mappers.UserMapper;
import com.projects.services.TacheService;
import com.projects.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class TacheServiceImpl implements TacheService {

    private final TacheRepository tacheRepository;
    private final TacheMapper tacheMapper;

    @Autowired
    public TacheServiceImpl(TacheRepository tacheRepository, TacheMapper tacheMapper) {
        this.tacheRepository = tacheRepository;
        this.tacheMapper = tacheMapper;
    }

    public void createTache(TacheDto dto) {
        tacheRepository.save(tacheMapper.tacheDtoToEntity(dto));

    }

    public void updateTache(Long id, TacheDto dto) {
        tacheRepository.findById(id).ifPresent(
                tacheEntity -> {
                    tacheEntity.setEmail(dto.getEmail());
                    tacheRepository.save(tacheEntity);
                }
        );

    }

    public void deleteTache(Long id) {
        tacheRepository.findById(id)
                .ifPresent(tacheRepository::delete);

    }

    public TacheDto getTache(Long id) {
        return tacheMapper.tacheToDto(tacheRepository.getReferenceById(id));
    }

    @Override
    public List<TacheDto> readAll() {
        return tacheRepository.findAll()
                .stream()
                .map(tacheMapper::tacheToDto)
                .collect(Collectors.toList());
    }
}
