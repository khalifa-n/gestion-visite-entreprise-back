package com.ecole221.gestion_visite_entreprise.data.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.*;

@Builder
@Data
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(callSuper = false)
@Entity
@Table(name = "personnelvisite")
public class PersonnelVisite extends AbstractEntity{
    @ManyToOne
    private Personnel personnel;
    @ManyToOne
    private Visite visite;
    @Column(nullable = true)
    private String contact;
}
