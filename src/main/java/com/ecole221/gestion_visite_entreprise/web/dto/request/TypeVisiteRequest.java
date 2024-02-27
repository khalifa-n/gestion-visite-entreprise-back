package com.ecole221.gestion_visite_entreprise.web.dto.request;

import com.ecole221.gestion_visite_entreprise.data.model.TypeVisite;
import lombok.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class TypeVisiteRequest implements RestRequest<TypeVisite> {
    private String libelle;

    @Override
    public TypeVisite toEntity() {
        return TypeVisite.builder().libelle(this.libelle).build();
    }
}
