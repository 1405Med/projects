package com.projects.mappers;


import com.projects.data.entities.CompteEntity;
import com.projects.data.entities.EmployeEntity;
import com.projects.dtos.CompteDto;
import com.projects.dtos.EmployeDto;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper
public interface EmployeMapper {
    EmployeEntity employeDtoToEntity(EmployeDto dto);

    EmployeDto employeToDto(EmployeEntity employeEntity);

}
