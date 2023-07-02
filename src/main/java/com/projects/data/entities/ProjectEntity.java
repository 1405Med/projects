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
@Table(name = "PROJECT")
@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class ProjectEntity implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String code;
    private String name;
    private String description;


    @Column(name = "DATE_DEBUT")
    private LocalDate dateDebut;


    @Column(name = "DATE_FIN")
    private LocalDate dateFin;

    @Column(name = "ESTIMATED_AMOUNT")
    private BigDecimal estimatedAmount;

    @Column(name = "REEL_AMOUNT")
    private BigDecimal reelAmount;
    @Enumerated(EnumType.STRING)
    private PriorityEnum priority;

    @ManyToOne
    private UserEntity admin;

    @ManyToOne
    private UserEntity responsable;

    @ManyToOne
    private ContratEntity contrat;


    @OneToMany(cascade = CascadeType.ALL)
    @JoinColumn(name = "tache_id")
    private List<TacheEntity> tacheEntities;

}
