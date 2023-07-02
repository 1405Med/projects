package com.projects.data.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.io.Serializable;

@Entity
@Table(name = "CONTRAT")
@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class ContratEntity implements Serializable {

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
