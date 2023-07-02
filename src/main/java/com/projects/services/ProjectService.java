package com.projects.services;

import com.projects.dtos.ProjectDto;

import java.util.List;

public interface ProjectService {

    void createProject(ProjectDto dto);

    void updateProject(Long id, ProjectDto dto);

    void deleteProject(Long id);

    ProjectDto getProject(Long id);

    List<ProjectDto> readAll();
}
