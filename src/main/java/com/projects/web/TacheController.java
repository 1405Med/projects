package com.projects.web;

import com.projects.dtos.CompteDto;
import com.projects.dtos.TacheDto;
import com.projects.services.CompteService;
import com.projects.services.TacheService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/tache")
@Slf4j
public class TacheController {

    private final TacheService tacheService;

    @Autowired
    public TacheController(TacheService tacheService)
    {
        this.tacheService = tacheService;
    }

    @GetMapping
    public List<TacheDto> readAll() {
        log.debug("start method read All");
        return tacheService.readAll();
    }

    @GetMapping("/{id}")
    public TacheDto findTacheById(@PathVariable("id") Long id) {
        log.debug("find project by id method {}", id);
        return tacheService.getTache(id);

    }

    @PostMapping
    public void createTache(@RequestBody TacheDto tacheDto) {
        log.debug("create project method");
        tacheService.createTache(tacheDto);
    }

    @PutMapping("/{id}")
    public void update(@PathVariable("id") Long id, @RequestBody CompteDto dto) {
        log.debug("start method update: {}", dto);
        compteService.updateCompte(id, dto);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable("id") Long id) {
        log.debug("start method delete: {}", id);
        tacheService.deleteTache(id);
    }

}
