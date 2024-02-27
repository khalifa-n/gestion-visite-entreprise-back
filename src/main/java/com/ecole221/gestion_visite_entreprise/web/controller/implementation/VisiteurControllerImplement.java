package com.ecole221.gestion_visite_entreprise.web.controller.implementation;

import com.ecole221.gestion_visite_entreprise.web.controller.VisiteurController;
import com.ecole221.gestion_visite_entreprise.web.dto.request.VisiteurRequest;
import com.ecole221.gestion_visite_entreprise.web.dto.response.VisiteurResponse;
import org.springframework.http.ResponseEntity;

public class VisiteurControllerImplement implements VisiteurController {


    @Override
    public ResponseEntity<VisiteurResponse> createVisiteur(VisiteurRequest visiteurRequest) {
        return null;
    }
}
