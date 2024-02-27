package com.ecole221.gestion_visite_entreprise.data.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;
import java.util.List;

@SuperBuilder
@Data
@EqualsAndHashCode(callSuper = false)
@Entity
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "visiteur")
public class Visiteur extends AbstractEntity{
    @Column(nullable = false)
    private String nom;
    @Column(nullable = false)
    private String prenom;
    @Column(nullable = true,unique = true)
    private String email;
    @Column(nullable = false,unique = true)
    private String telephone;
    @ManyToMany
    List<Visite> visites;
    @ManyToMany
    List<ControleVisiteur> controleVisiteurs;
    @ManyToMany(mappedBy = "visiteurs")
    List<Entreprise> entreprises;
}
