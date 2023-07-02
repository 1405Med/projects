package com.projects.services;

import com.projects.dtos.UserDto;

import java.util.List;

public interface UserService {

    void createUser(UserDto dto);

    void updateUser(Long id, UserDto dto);

    void deleteUser(Long id);

    UserDto getUser(Long id);

    List<UserDto> readAll();
}
