package com.ecole221.gestion_visite_entreprise.web.controller.implementation;

import com.ecole221.gestion_visite_entreprise.web.controller.VisiteController;
import com.ecole221.gestion_visite_entreprise.web.dto.request.VisiteRequest;
import com.ecole221.gestion_visite_entreprise.web.dto.response.VisiteResponse;
import org.springframework.http.ResponseEntity;

public class ControleControllerImplement implements VisiteController {

    @Override
    public ResponseEntity<VisiteResponse> createVisite(VisiteRequest visiteRequest) {
        return null;
    }
}
