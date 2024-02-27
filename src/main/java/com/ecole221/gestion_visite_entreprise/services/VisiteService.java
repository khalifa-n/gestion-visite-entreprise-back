package com.ecole221.gestion_visite_entreprise.services;

import com.ecole221.gestion_visite_entreprise.web.dto.request.VisiteRequest;
import com.ecole221.gestion_visite_entreprise.web.dto.response.VisiteResponse;

public interface VisiteService {
    VisiteResponse createVisite(VisiteRequest request);
}
