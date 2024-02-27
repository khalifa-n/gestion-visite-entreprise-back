package com.ecole221.gestion_visite_entreprise.web.controller.implementation;

import com.ecole221.gestion_visite_entreprise.services.TypeVisiteService;
import com.ecole221.gestion_visite_entreprise.web.controller.TypeVisiteController;
import com.ecole221.gestion_visite_entreprise.web.dto.request.TypeVisiteRequest;
import com.ecole221.gestion_visite_entreprise.web.dto.response.TypeVisiteResponse;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.UUID;

@RestController
@RequiredArgsConstructor
public class TypeVisiteControllerImplement implements TypeVisiteController {
    private final TypeVisiteService typeVisiteService;

    @Override
    public ResponseEntity<TypeVisiteResponse> createTypeVisite(TypeVisiteRequest typeVisiteRequest) {
        TypeVisiteResponse typeVisiteResponse = typeVisiteService.createTypeVisite(typeVisiteRequest);

        String message= "succes";
        return ResponseEntity.status(HttpStatus.CREATED)
                .header("Message",message)
                .body(typeVisiteResponse);
    }

    @Override
    public ResponseEntity<TypeVisiteResponse> updateTypeVisite( UUID id, TypeVisiteRequest typeVisiteRequest) {
        TypeVisiteResponse typeVisiteResponse = typeVisiteService.updateTypeVisite(id, typeVisiteRequest);

        String message= "succes";
        return ResponseEntity.status(HttpStatus.CREATED)
                .header("Message",message)
                .body(typeVisiteResponse);
    }

    @Override
    public ResponseEntity<TypeVisiteResponse> deleteTypeVisite(UUID id) {
        TypeVisiteResponse typeVisiteResponse = typeVisiteService.deleteTypeVisite(id);

        if (typeVisiteResponse == null) {
            return ResponseEntity.notFound().build();
        }

        String message = "Type de visite supprimé avec succès.";
        return ResponseEntity.ok()
                .header("Message", message)
                .body(typeVisiteResponse);
    }

    @Override
    public ResponseEntity<List<TypeVisiteResponse>> listTypesVisite() {
        List<TypeVisiteResponse> typeVisiteResponses = typeVisiteService.listTypesVisite();
        return new ResponseEntity<>(typeVisiteResponses, HttpStatus.OK);
    }
}
