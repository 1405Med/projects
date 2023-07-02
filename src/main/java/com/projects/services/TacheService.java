package com.projects.services;

import com.projects.dtos.CompteDto;
import com.projects.dtos.TacheDto;

import java.util.List;

public interface TacheService {

    void createTache(TacheDto dto);

    void updateTache(Long id, TacheDto dto);

    void deleteTache(Long id);

   TacheDto getTache(Long id);

    List<TacheDto> readAll();
}
