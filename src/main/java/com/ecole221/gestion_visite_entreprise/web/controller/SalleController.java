package com.ecole221.gestion_visite_entreprise.web.controller;

import com.ecole221.gestion_visite_entreprise.web.dto.request.SalleRequest;
import com.ecole221.gestion_visite_entreprise.web.dto.response.SalleResponse;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

public interface SalleController {
    @PostMapping
    ResponseEntity<SalleResponse> createSalle(@Validated @RequestBody SalleRequest salleRequest);
}
