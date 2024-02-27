package com.ecole221.gestion_visite_entreprise.web.controller;

import com.ecole221.gestion_visite_entreprise.web.dto.request.EntrepriseRequest;
import com.ecole221.gestion_visite_entreprise.web.dto.response.EntrepriseResponse;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

public interface EntrepriseController {
    @PostMapping
    ResponseEntity<EntrepriseResponse> createEntreprise(@Validated @RequestBody EntrepriseRequest entrepriseRequest);
}
