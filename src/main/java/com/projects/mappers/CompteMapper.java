package com.projects.mappers;


import com.projects.data.entities.CompteEntity;
import com.projects.data.entities.ProjectEntity;
import com.projects.dtos.CompteDto;
import com.projects.dtos.ProjectDto;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper
public interface CompteMapper {

    CompteEntity compteDtoToEntity(CompteDto dto);

    CompteDto compteToDto(CompteEntity compteEntity);

}
