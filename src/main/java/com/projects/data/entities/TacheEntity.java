package com.projects.data.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.io.Serializable;
import java.util.List;

@Entity
@Table(name = "TACHE")
@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class TacheEntity implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String code;
    private String name;
    private String description;
    private String email;
    private String Statut;
    private Long telephone;
    private Long LaDateDeDebut;
    private Long LaDateDecheance;
    @ManyToOne
    private ProjectEntity projectEntity;

    @OneToMany(cascade = CascadeType.ALL)
    @JoinColumn(name = "employee_id")
    private List<EmployeEntity> employeEntities;



}
