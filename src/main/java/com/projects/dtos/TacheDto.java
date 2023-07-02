package com.projects.dtos;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class TacheDto {

    private Long id;
    private String code;
    private String name;
    private String description;
    private String email;
    private String Statut;
    private Long telephone;
    private Long LaDateDeDebut;
    private Long LaDateDecheance;
}
