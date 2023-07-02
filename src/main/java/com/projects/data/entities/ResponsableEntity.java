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

@Entity
@Table(name = "RESPONSABLE")
@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class ResponsableEntity implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String code;
    private String name;
    private String description;
    private String fonction;
    private String service;
    private String adresseEmail;




}
