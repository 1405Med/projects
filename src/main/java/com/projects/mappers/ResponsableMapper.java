package com.projects.mappers;


import com.projects.data.entities.ProjectEntity;
import com.projects.data.entities.ResponsableEntity;
import com.projects.dtos.ProjectDto;
import com.projects.dtos.ResponsableDto;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper(implementationPackage = "mapper.impl",componentModel = "spring")
public interface ResponsableMapper {

    UserMapper INSTANCE = Mappers.getMapper(UserMapper.class);
    ResponsableEntity responsableDtoToEntity(ResponsableDto dto);

    ResponsableDto responsableToDto(ResponsableEntity responsableEntity);

}
