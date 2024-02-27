package com.ecole221.gestion_visite_entreprise.data.model;

import jakarta.persistence.*;
import lombok.*;
import java.time.LocalTime;
import java.util.List;

@Builder
@Data
@EqualsAndHashCode(callSuper = false)
@Entity
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "controle")
public class Controle extends AbstractEntity {
    @Column(nullable = false)
    private LocalTime heureDebut;
    @Column(nullable = false)
    private LocalTime heureFin;
    @Column(nullable = false,unique = true)
    private String pieceFourni;
    @ManyToOne
    private Personnel personnel;
    @ManyToOne
    private Visite visite;
    @OneToMany
    List<ControleVisiteur> controleVisiteurs;
}
