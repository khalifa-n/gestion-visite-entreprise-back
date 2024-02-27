package com.ecole221.gestion_visite_entreprise.data.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;
import java.util.List;

@EqualsAndHashCode(callSuper = true)
@Data
@SuperBuilder
@Entity
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "personnel")
public class Personnel extends Visiteur{
    @Column(nullable = false,unique = true)
    private String matricule;
    @OneToMany
    List<Controle> controles;
    @OneToMany
    List<PersonnelVisite> personnelVisites;
}
