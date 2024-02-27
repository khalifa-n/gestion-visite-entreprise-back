package com.ecole221.gestion_visite_entreprise.services.implementation;

import com.ecole221.gestion_visite_entreprise.data.model.TypeVisite;
import com.ecole221.gestion_visite_entreprise.data.repository.TypeVisiteRepository;
import com.ecole221.gestion_visite_entreprise.services.TypeVisiteService;
import com.ecole221.gestion_visite_entreprise.web.dto.request.TypeVisiteRequest;
import com.ecole221.gestion_visite_entreprise.web.dto.response.TypeVisiteResponse;
import com.ecole221.gestion_visite_entreprise.web.exceptions.costumisation.ApplicationException;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.UUID;

@Service

public class TypeVisiteServiceImplement implements TypeVisiteService {
    private  final TypeVisiteRepository typeVisiteRepository;

    public TypeVisiteServiceImplement(TypeVisiteRepository typeVisiteRepository) {
        this.typeVisiteRepository = typeVisiteRepository;
    }

    @Override
    public TypeVisiteResponse createTypeVisite(TypeVisiteRequest typeVisiteRequest) {
        return  TypeVisiteResponse.toResponse(typeVisiteRepository.save(typeVisiteRequest.toEntity()));

    }

    @Override
    public TypeVisiteResponse updateTypeVisite(UUID id, TypeVisiteRequest typeVisiteRequest) {
        Optional<TypeVisite> optionalTypeVisite = typeVisiteRepository.findById(id);
        if(optionalTypeVisite.isEmpty()){
            throw new ApplicationException("Id not exist");
        }
            TypeVisite typeVisite = optionalTypeVisite.get();
            typeVisite.setLibelle(typeVisiteRequest.getLibelle());

         return  TypeVisiteResponse.toResponse(typeVisiteRepository.save(typeVisite));

    }

    @Override
    public TypeVisiteResponse deleteTypeVisite(UUID id) {
        Optional<TypeVisite> optionalTypeVisite = typeVisiteRepository.findById(id);
        if(optionalTypeVisite.isEmpty()){
            throw new ApplicationException("Id not exist");
        }
        TypeVisite typeVisite = optionalTypeVisite.get();
        typeVisiteRepository.delete(typeVisite);

        return TypeVisiteResponse.toResponse(typeVisite);
    }

    @Override
    public List<TypeVisiteResponse> listTypesVisite() {
        List<TypeVisite> typesVisite = typeVisiteRepository.findAll(); // Récupérer tous les types de visite depuis la base de données
        List<TypeVisiteResponse> responses = new ArrayList<>();
        for (TypeVisite typeVisite : typesVisite) {
            responses.add(TypeVisiteResponse.toResponse(typeVisite));
        }
        return responses;
    }

}
