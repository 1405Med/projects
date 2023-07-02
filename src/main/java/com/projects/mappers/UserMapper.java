package com.projects.mappers;


import com.projects.data.entities.UserEntity;
import com.projects.dtos.UserDto;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper(implementationPackage = "mapper.impl",componentModel ="spring")
public interface UserMapper {
    UserMapper INSTANCE = Mappers.getMapper(UserMapper.class);

    UserEntity userDtoToEntity(UserDto dto);

    UserDto userToDto(UserEntity userEntity);

}
