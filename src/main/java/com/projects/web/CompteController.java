package com.projects.web;

import com.projects.dtos.CompteDto;
import com.projects.dtos.ProjectDto;
import com.projects.services.CompteService;
import com.projects.services.ProjectService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/compte")
@Slf4j
public class CompteController {

    private final CompteService compteService;

    @Autowired
    public CompteController(CompteService compteService) {
        this.compteService = compteService;
    }

    @GetMapping
    public List<CompteDto> readAll() {
        log.debug("start method read All");
        return compteService.readAll();
    }

    @GetMapping("/{id}")
    public CompteDto findCompteById(@PathVariable("id") Long id) {
        log.debug("find project by id method {}", id);
        return compteService.getCompte(id);

    }

    @PostMapping
    public void createCompte(@RequestBody CompteDto compteDto) {
        log.debug("create project method");
        compteService.createCompte(compteDto);
    }

    @PutMapping("/{id}")
    public void update(@PathVariable("id") Long id, @RequestBody CompteDto dto) {
        log.debug("start method update: {}", dto);
        compteService.updateCompte(id, dto);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable("id") Long id) {
        log.debug("start method delete: {}", id);
        compteService.deleteCompte(id);
    }

}
