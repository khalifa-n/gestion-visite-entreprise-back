package com.ecole221.gestion_visite_entreprise.data.model;

import jakarta.persistence.*;
import lombok.*;
import java.util.List;

@Builder
@Data
@EqualsAndHashCode(callSuper = false)
@Entity
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "entreprise")
public class Entreprise extends AbstractEntity {
    @Column(nullable = false,unique = true)
    private String nom;
    @Column(nullable = false,unique = true)
    private String email;
    @OneToMany
    List<Visite> visiteList;
    @ManyToMany
    List<Visiteur> visiteurs;
}