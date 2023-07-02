package com.projects.web;

import com.projects.dtos.CompteDto;
import com.projects.dtos.ContratDto;
import com.projects.services.CompteService;
import com.projects.services.ContratService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/compte")
@Slf4j
public class ContratController {

    private final ContratService contratService;

    @Autowired
    public ContratController(ContratService contratService)
    {
        this.contratService = contratService;
    }

    @GetMapping
    public List<ContratDto> readAll() {
        log.debug("start method read All");
        return contratService.readAll();
    }

    @GetMapping("/{id}")
    public ContratDto findContrateById(@PathVariable("id") Long id) {
        log.debug("find project by id method {}", id);
        return contratService.getContrat(id);

    }

    @PostMapping
    public void createContrat(@RequestBody ContratDto contratDto) {
        log.debug("create project method");
        contratService.createContrat(contratDto);
    }

    @PutMapping("/{id}")
    public void update(@PathVariable("id") Long id, @RequestBody ContratDto dto) {
        log.debug("start method update: {}", dto);
        contratService.updateContrat(id, dto);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable("id") Long id) {
        log.debug("start method delete: {}", id);
        contratService.deleteContrat(id);
    }

}
