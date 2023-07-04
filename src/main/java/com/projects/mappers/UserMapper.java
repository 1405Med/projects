package com.projects.mappers;


import com.projects.data.entities.UserEntity;
import com.projects.dtos.UserDto;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper
public interface UserMapper {
    UserEntity userDtoToEntity(UserDto dto);

    UserDto userToDto(UserEntity userEntity);

}
