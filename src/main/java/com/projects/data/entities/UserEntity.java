package com.projects.data.entities;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import jakarta.persistence.*;

import java.util.List;

@Entity
@Table(name = "USER")
@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class UserEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String LastName;
    private String firstName;
    private String type;
    private String telephone;
    private String email;

    @OneToMany(cascade = CascadeType.ALL)
    @JoinColumn(name = "compte_id")
    private List<CompteEntity> compteEntityList;


    @OneToMany(cascade = CascadeType.ALL)
    @JoinColumn(name = "projet_id")
    private List<ProjectEntity> projectEntities;

}

