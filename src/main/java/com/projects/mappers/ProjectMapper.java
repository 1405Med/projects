package com.projects.mappers;


import com.projects.data.entities.ProjectEntity;
import com.projects.dtos.ProjectDto;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper
public interface ProjectMapper {

    ProjectEntity projectDtoToEntity(ProjectDto dto);

    ProjectDto projectToDto(ProjectEntity projectEntity);

}
