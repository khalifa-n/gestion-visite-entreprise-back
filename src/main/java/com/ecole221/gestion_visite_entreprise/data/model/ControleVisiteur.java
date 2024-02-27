package com.ecole221.gestion_visite_entreprise.data.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.*;

@Builder
@Data
@EqualsAndHashCode(callSuper = false)
@Entity
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "controlevisiteur")
public class ControleVisiteur extends AbstractEntity{
    @ManyToOne
    private Controle controle;
    @ManyToOne
    private Visiteur visiteur;
    @Column(nullable = false)
    private String PersonnePresent;
}
