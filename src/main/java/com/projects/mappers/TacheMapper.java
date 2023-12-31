package com.projects.mappers;


import com.projects.data.entities.CompteEntity;
import com.projects.data.entities.TacheEntity;
import com.projects.dtos.CompteDto;
import com.projects.dtos.TacheDto;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper(implementationPackage = "mapper.impl",componentModel = "spring")
public interface TacheMapper {

    UserMapper INSTANCE = Mappers.getMapper(UserMapper.class);
    TacheEntity tacheDtoToEntity(TacheDto dto);

    TacheDto tacheToDto(TacheEntity tacheEntity);

}
