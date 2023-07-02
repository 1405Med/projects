package com.projects.services.impl;

import com.projects.data.repositories.ProjectRepository;
import com.projects.dtos.ProjectDto;
import com.projects.mappers.ProjectMapper;
import com.projects.services.ProjectService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class ProjectServiceImpl implements ProjectService {

    private final ProjectRepository projectRepository;
    private final ProjectMapper projectMapper;

    @Autowired
    public ProjectServiceImpl(ProjectRepository projectRepository, ProjectMapper projectMapper) {
        this.projectRepository = projectRepository;
        this.projectMapper = projectMapper;
    }

    public void createProject(ProjectDto dto) {
        projectRepository.save(projectMapper.projectDtoToEntity(dto));

    }

    public void updateProject(Long id, ProjectDto dto) {
        projectRepository.findById(id).ifPresent(
                project -> {
                    project.setName(dto.getName());
                    projectRepository.save(project);
                }
        );

    }

    public void deleteProject(Long id) {
        projectRepository.findById(id)
                .ifPresent(project -> projectRepository.deleteById(id));

    }

    public ProjectDto getProject(Long id) {
        return projectMapper.projectToDto(projectRepository.getReferenceById(id));
    }

    @Override
    public List<ProjectDto> readAll() {
        return projectRepository.findAll()
                .stream()
                .map(projectMapper::projectToDto)
                .collect(Collectors.toList());
    }
}
