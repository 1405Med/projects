package com.projects.web;

import com.projects.dtos.CompteDto;
import com.projects.dtos.ProjectDto;
import com.projects.dtos.ResponsableDto;
import com.projects.services.ResponsableService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/responsable")
@Slf4j
public class ResponsableController {

    private final ResponsableService responsableService;

    @Autowired
    public ResponsableController(ResponsableService responsableService) {
        this.responsableService = responsableService;
    }

    @GetMapping
    public List<ResponsableDto> readAll() {
        log.debug("start method read All");
        return responsableService.readAll();
    }

   @GetMapping("/{id}")
    public ResponsableDto findResponsableById(@PathVariable("id") Long id) {
        log.debug("find project by id method {}", id);
        return responsableService.getResponsable(id);
    }

    @PostMapping("/{id}")
    public void createResponsable(@RequestBody ResponsableDto responsableDto) {
        log.debug("create project method");
        responsableService.createResponsable(responsableDto);
    }

    @PutMapping("/{id}")
    public void update(@PathVariable("id") Long id, @RequestBody ResponsableDto dto) {
        log.debug("start method update: {}", dto);
        responsableService.updateResponsable(id, dto);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable("id") Long id) {
        log.debug("start method delete: {}", id);
        responsableService.deleteResponsable(id);
    }

}
