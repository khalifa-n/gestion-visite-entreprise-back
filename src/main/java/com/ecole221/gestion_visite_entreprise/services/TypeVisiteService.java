package com.ecole221.gestion_visite_entreprise.services;

import com.ecole221.gestion_visite_entreprise.web.dto.request.TypeVisiteRequest;
import com.ecole221.gestion_visite_entreprise.web.dto.response.TypeVisiteResponse;

import java.util.List;
import java.util.UUID;

public interface TypeVisiteService {
TypeVisiteResponse createTypeVisite(TypeVisiteRequest typeVisiteRequest);
TypeVisiteResponse updateTypeVisite(UUID id,TypeVisiteRequest typeVisiteRequest);
TypeVisiteResponse deleteTypeVisite(UUID id);
List<TypeVisiteResponse> listTypesVisite();



}
