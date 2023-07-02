package com.projects.data.entities;

import com.projects.dtos.PriorityEnum;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.io.Serializable;
import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.List;

@Entity
@Table(name = "COPMTE")
@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class CompteEntity implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String code;
    private String name;
    private String description;
    private String email;
    private String adressDeFacturation;

    @Column(name = "ADRESSE_D'EXPIDITION")
    private String  adresseDexpidition;

    @OneToMany(cascade = CascadeType.ALL)
    @JoinColumn(name = "responsable_id")
    private List<ResponsableEntity> responsableEntityList;


    private String comptePrincipal;
    private String secteurDactivité;
    private Long telephone;



}
