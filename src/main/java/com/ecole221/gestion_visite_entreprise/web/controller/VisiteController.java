package com.ecole221.gestion_visite_entreprise.web.controller;

import com.ecole221.gestion_visite_entreprise.web.dto.request.VisiteRequest;
import com.ecole221.gestion_visite_entreprise.web.dto.response.VisiteResponse;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

public interface VisiteController {
    @PostMapping
    ResponseEntity<VisiteResponse> createVisite(@Validated @RequestBody VisiteRequest visiteRequest);
}
