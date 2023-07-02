package com.projects.dtos;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class ResponsableDto {

    private Long id;
    private String code;
    private String name;
    private String description;
    private String fonction;
    private String service;
    private String adresseEmail;
}
