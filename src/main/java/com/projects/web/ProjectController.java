package com.projects.web;

import com.projects.dtos.ProjectDto;
import com.projects.services.ProjectService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/project")
@Slf4j
public class ProjectController {

    private final ProjectService projectService;

    @Autowired
    public ProjectController(ProjectService projectService) {
        this.projectService = projectService;
    }

    @GetMapping
    public List<ProjectDto> readAll() {
        log.debug("start method read All");
        return projectService.readAll();
    }

    @GetMapping("/{id}")
    public ProjectDto findProjectById(@PathVariable("id") Long id) {
        log.debug("find project by id method {}", id);
        return projectService.getProject(id);

    }

    @PostMapping
    public void createProject(@RequestBody ProjectDto projectDto) {
        log.debug("create project method");
        projectService.createProject(projectDto);
    }

    @PutMapping("/{id}")
    public void update(@PathVariable("id") Long id, @RequestBody ProjectDto dto) {
        log.debug("start method update: {}", dto);
        projectService.updateProject(id, dto);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable("id") Long id) {
        log.debug("start method delete: {}", id);
        projectService.deleteProject(id);
    }

}
