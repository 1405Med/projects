package com.projects.data.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.io.Serializable;

@Entity
@Table(name = "employé")
@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class EmployeEntity implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String code;
    private String name;
    private String lastName;
    private String email;
    private String adressDeFacturation;
    private String etatFamiliale;
    private String typeDeContrat;
    private String specialite;
    private String secteurDactivite;
    private Long telephone;

    @ManyToOne
    private TacheEntity tacheEntity;



}
