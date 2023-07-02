package com.projects.services;

import com.projects.dtos.EmployeDto;

import java.util.List;

public interface EmployeService {

    void createEmploye(EmployeDto dto);

    void updateEmploye(Long id, EmployeDto dto);

    void deleteEmploye(Long id);

   EmployeDto getEmploye(Long id);

    List<EmployeDto> readAll();
}
