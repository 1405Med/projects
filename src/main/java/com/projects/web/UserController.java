package com.projects.web;

import com.projects.dtos.UserDto;
import com.projects.services.UserService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/user")
@Slf4j
public class UserController {

    private final UserService userService;

    @Autowired
    public UserController(UserService userService) {
        this.userService = userService;
    }

    @GetMapping
    public List<UserDto> readAll() {
        log.debug("start method read All");
        return userService.readAll();
    }

    @GetMapping("/{id}")
    public UserDto findUserById(@PathVariable("id") Long id) {
        log.debug("find student by id method {}", id);
        return userService.getUser(id);

    }

    @PostMapping
    public void createUser(@RequestBody UserDto userDto) {
        log.debug("create user method");
        userService.createUser(userDto);
    }

    @PutMapping("/{id}")
    public void update(@PathVariable("id") Long id, @RequestBody UserDto dto) {
        log.debug("start method update: {}", dto);
        userService.updateUser(id, dto);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable("id") Long id) {
        log.debug("start method delete: {}", id);
        userService.deleteUser(id);
    }

}
