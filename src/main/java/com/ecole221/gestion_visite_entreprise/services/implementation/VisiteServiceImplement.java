package com.ecole221.gestion_visite_entreprise.services.implementation;

import com.ecole221.gestion_visite_entreprise.data.repository.VisiteRepository;
import com.ecole221.gestion_visite_entreprise.services.VisiteService;
import com.ecole221.gestion_visite_entreprise.web.dto.request.VisiteRequest;
import com.ecole221.gestion_visite_entreprise.web.dto.response.VisiteResponse;
import org.springframework.stereotype.Service;

@Service
public class VisiteServiceImplement implements VisiteService {
    private VisiteRepository visiteRepository;
    @Override
    public VisiteResponse createVisite(VisiteRequest request) {
        return null;
    }
}
