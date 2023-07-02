package com.projects.dtos;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.math.BigDecimal;
import java.time.LocalDate;

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class CompteDto {

    private Long id;
    private String code;
    private String name;
    private String description;
    private String email;
    private String adressDeFacturation;
    private String  adresseDexpidition;
    private String comptePrincipal;
    private String secteurDactivité;
    private Long telephone;
}
