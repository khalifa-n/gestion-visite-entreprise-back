package com.ecole221.gestion_visite_entreprise.web.controller.implementation;

import com.ecole221.gestion_visite_entreprise.web.controller.SalleController;
import com.ecole221.gestion_visite_entreprise.web.dto.request.SalleRequest;
import com.ecole221.gestion_visite_entreprise.web.dto.response.SalleResponse;
import org.springframework.http.ResponseEntity;

public class SalleControllerImplement implements SalleController {


    @Override
    public ResponseEntity<SalleResponse> createSalle(SalleRequest salleRequest) {
        return null;
    }
}
