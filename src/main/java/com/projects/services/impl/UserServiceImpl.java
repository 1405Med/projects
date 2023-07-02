package com.projects.services.impl;

import com.projects.data.repositories.UserRepository;
import com.projects.dtos.UserDto;
import com.projects.mappers.UserMapper;
import com.projects.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class UserServiceImpl implements UserService {

    private final UserRepository userRepository;
    private final UserMapper userMapper;

    @Autowired
    public UserServiceImpl(UserRepository userRepository, UserMapper userMapper) {
        this.userRepository = userRepository;
        this.userMapper = userMapper;
    }

    public void createUser(UserDto dto) {
        userRepository.save(userMapper.userDtoToEntity(dto));

    }

    public void updateUser(Long id, UserDto dto) {
        userRepository.findById(id).ifPresent(
                userEntity -> {
                    userEntity.setEmail(dto.getEmail());
                    userEntity.setFirstName(dto.getFirstName());
                    userEntity.setLastName(dto.getLastName());
                    userRepository.save(userEntity);
                }
        );

    }

    public void deleteUser(Long id) {
        userRepository.findById(id)
                .ifPresent(userRepository::delete);

    }

    public UserDto getUser(Long id) {
        return userMapper.userToDto(userRepository.getReferenceById(id));
    }

    @Override
    public List<UserDto> readAll() {
        return userRepository.findAll()
                .stream()
                .map(userMapper::userToDto)
                .collect(Collectors.toList());
    }
}
