package com.ecole221.gestion_visite_entreprise.web.dto.response;

import com.ecole221.gestion_visite_entreprise.data.model.TypeVisite;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;
import java.util.UUID;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class TypeVisiteResponse   {
   private UUID id;
    private String libelle;

    public static TypeVisiteResponse toResponse(TypeVisite typeVisite) {
        return TypeVisiteResponse.builder().id(typeVisite.getId()).libelle(typeVisite.getLibelle()).build();
    }


}
