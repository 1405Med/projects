package com.projects.web;

import com.projects.dtos.EmployeDto;
import com.projects.dtos.UserDto;
import com.projects.services.EmployeService;
import com.projects.services.UserService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/employe")
@Slf4j
public class EmployeController {

    private final EmployeService employeService;

    @Autowired
    public EmployeController(EmployeService employeService) {
        this.employeService = employeService;
    }

    @GetMapping
    public List<EmployeDto> readAll() {
        log.debug("start method read All");
        return employeService.readAll();
    }

    @GetMapping("/{id}")
    public EmployeDto findEmployeById(@PathVariable("id") Long id) {
        log.debug("find employe by id method {}", id);
        return employeService.getEmploye(id);

    }

    @PostMapping
    public void createEmploye(@RequestBody EmployeDto employeDto) {
        log.debug("create user method");
        employeService.createEmploye(employeDto);
    }

    @PutMapping("/{id}")
    public void update(@PathVariable("id") Long id, @RequestBody EmployeDto dto) {
        log.debug("start method update: {}", dto);
        employeService.updateEmploye(id, dto);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable("id") Long id) {
        log.debug("start method delete: {}", id);
        employeService.deleteEmploye(id);
    }

}
