package com.ecole221.gestion_visite_entreprise.web.controller;

import com.ecole221.gestion_visite_entreprise.web.dto.request.ControleRequest;
import com.ecole221.gestion_visite_entreprise.web.dto.response.ControleResponse;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

public interface ControleController {
    @PostMapping
    ResponseEntity<ControleResponse> createControle(@Validated @RequestBody ControleRequest controleRequest);
}
