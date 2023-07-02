package com.projects.services;

import com.projects.dtos.CompteDto;
import com.projects.dtos.ResponsableDto;

import java.util.List;

public interface ResponsableService {

    void createResponsable(ResponsableDto dto);

    void updateResponsable(Long id, ResponsableDto dto);

    void deleteResponsable(Long id);

   ResponsableDto getResponsable(Long id);

    List<ResponsableDto> readAll();
}
