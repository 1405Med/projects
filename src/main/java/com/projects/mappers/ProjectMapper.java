package com.projects.mappers;


import com.projects.data.entities.ProjectEntity;
import com.projects.dtos.ProjectDto;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper(implementationPackage = "mapper.impl",componentModel = "spring")
public interface ProjectMapper {

    UserMapper INSTANCE = Mappers.getMapper(UserMapper.class);
    ProjectEntity projectDtoToEntity(ProjectDto dto);

    ProjectDto projectToDto(ProjectEntity projectEntity);

}
