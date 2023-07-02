package com.projects.mappers;


import com.projects.data.entities.CompteEntity;
import com.projects.data.entities.ContratEntity;
import com.projects.dtos.CompteDto;
import com.projects.dtos.ContratDto;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper(implementationPackage = "mapper.impl",componentModel = "spring")
public interface ContratMapper {

    UserMapper INSTANCE = Mappers.getMapper(UserMapper.class);
    ContratEntity contratDtoToEntity(ContratDto dto);

    ContratDto contraToDto(ContratEntity contratEntity);

}
