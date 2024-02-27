package com.ecole221.gestion_visite_entreprise.data.model;

import jakarta.persistence.*;
import lombok.*;
import java.time.LocalDate;
import java.time.LocalTime;
import java.util.List;

@Builder
@Data @NoArgsConstructor @AllArgsConstructor
@EqualsAndHashCode(callSuper = false)
@Entity
@Table(name = "visite")
public class Visite extends AbstractEntity {
    @Column(nullable = false)
    private LocalDate date;
    @Column(nullable = false)
    private LocalTime heureDebut;
    @Column(nullable = false)
    private LocalTime heureFin;
    @Column(nullable = false)
    private int etat;
    @Column(nullable = true)
    private String compteRendu;
    @ManyToOne
    private TypeVisite typeVisite;
    @OneToOne
    private Salle salle;
    @ManyToOne
    private Entreprise entreprise;
    @OneToMany
    List<Controle> controles;
    @OneToMany
    List<PersonnelVisite> personnelVisites;
    @ManyToMany(mappedBy = "visites")
    List<Visiteur> visiteurs;

}
