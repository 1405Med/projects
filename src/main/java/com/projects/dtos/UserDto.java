package com.projects.dtos;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class UserDto {

    private Long id;
    private String LastName;
    private String firstName;
    private String type;
    private String telephone;
    private String email;
}
