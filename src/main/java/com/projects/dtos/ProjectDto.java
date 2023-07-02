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
public class ProjectDto {

    private Long id;
    private String code;
    private String name;
    private String description;
    private LocalDate dateDebut;
    private LocalDate dateFin;
    private BigDecimal estimatedAmount;
    private BigDecimal reelAmount;
    private PriorityEnum priority;
}
