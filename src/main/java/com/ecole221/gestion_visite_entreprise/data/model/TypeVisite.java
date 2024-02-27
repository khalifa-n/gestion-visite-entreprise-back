package com.ecole221.gestion_visite_entreprise.data.model;

import jakarta.persistence.*;
import lombok.*;

import java.util.List;

@EqualsAndHashCode(callSuper = false)
@Builder
@Data
@Entity
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "typevisite")
public class TypeVisite extends AbstractEntity{
    @Column(nullable = false)
    @NonNull
    private String libelle;
    @OneToMany(mappedBy = "typeVisite",fetch = FetchType.LAZY)
    private List<Visite> visites;

}
