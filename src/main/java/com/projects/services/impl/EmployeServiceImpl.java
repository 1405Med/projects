package com.projects.services.impl;

import com.projects.data.repositories.EmployeRepository;
import com.projects.dtos.EmployeDto;
import com.projects.mappers.EmployeMapper;
import com.projects.services.EmployeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class EmployeServiceImpl implements EmployeService {

    private final EmployeRepository employeRepository;
    private final EmployeMapper employeMapper;

    @Autowired
    public EmployeServiceImpl(EmployeRepository employeRepository, EmployeMapper employeMapper) {
        this.employeRepository = employeRepository;
        this.employeMapper = employeMapper;
    }

    public void createEmploye(EmployeDto dto) {
        employeRepository.save(employeMapper.employeDtoToEntity(dto));

    }

    public void updateEmploye(Long id, EmployeDto dto) {
        employeRepository.findById(id).ifPresent(
                employe -> {
                    employe.setName(dto.getName());
                    employeRepository.save(employe);
                }
        );

    }

    public void deleteEmploye(Long id) {
        employeRepository.findById(id)
                .ifPresent(employe -> employeRepository.deleteById(id));

    }

    public EmployeDto getEmploye(Long id) {
        return employeMapper.employeToDto(employeRepository.getReferenceById(id));
    }

    @Override
    public List<EmployeDto> readAll() {
        return employeRepository.findAll()
                .stream()
                .map(employeMapper::employeToDto)
                .collect(Collectors.toList());
    }
}
