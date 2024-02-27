package com.ecole221.gestion_visite_entreprise.web.controller;

import com.ecole221.gestion_visite_entreprise.web.dto.request.VisiteurRequest;
import com.ecole221.gestion_visite_entreprise.web.dto.response.VisiteurResponse;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

public interface VisiteurController {
    @PostMapping
    ResponseEntity<VisiteurResponse> createVisiteur(@Validated @RequestBody VisiteurRequest visiteurRequest);
}
