package com.projects.mappers;


import com.projects.data.entities.CompteEntity;
import com.projects.data.entities.EmployeEntity;
import com.projects.dtos.CompteDto;
import com.projects.dtos.EmployeDto;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper(implementationPackage = "mapper.impl",componentModel = "spring")
public interface EmployeMapper {

    UserMapper INSTANCE = Mappers.getMapper(UserMapper.class);
    static EmployeEntity employeDtoToEntity(EmployeDto dto);

    EmployeDto employeToDto(EmployeEntity employeEntity);

}
