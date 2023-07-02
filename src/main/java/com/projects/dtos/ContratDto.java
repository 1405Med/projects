package com.projects.dtos;

import jakarta.persistence.Column;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor

public class ContratDto {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String code;
    private String name;
    private String description;
    private String type;
    private String adressDeFacturation;

    @Column(name = "ADRESSE_D'EXPIDITION")
    private String  adresseDexpidition;


    private String comptePrincipal;
    private String secteurDactivite;
    private Long telephone;
    private String dateDeSignatueContrat;
    private String dureeDuContrat;
    private String compteClient;
}
