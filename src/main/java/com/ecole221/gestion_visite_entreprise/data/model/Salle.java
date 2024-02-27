package com.ecole221.gestion_visite_entreprise.data.model;

import jakarta.persistence.*;
import lombok.*;
@Builder
@Data
@EqualsAndHashCode(callSuper = false)
@Entity
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "salle")
public class Salle extends AbstractEntity{
    @Column(nullable = false,unique = true)
    private String libelle;
    @Column(nullable = false)
    private int nbreplace;
    @OneToOne
    private Visite visite;
}
