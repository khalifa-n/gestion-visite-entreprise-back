package com.ecole221.gestion_visite_entreprise.web.controller;

import com.ecole221.gestion_visite_entreprise.web.dto.request.TypeVisiteRequest;
import com.ecole221.gestion_visite_entreprise.web.dto.response.TypeVisiteResponse;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.UUID;
@RequestMapping("api/typevisite")
public interface TypeVisiteController {
    @PostMapping
    ResponseEntity<TypeVisiteResponse> createTypeVisite(@Validated @RequestBody TypeVisiteRequest typeVisiteRequest);
    @PutMapping("/{id}")
    ResponseEntity<TypeVisiteResponse> updateTypeVisite(@PathVariable UUID id, @Validated @RequestBody TypeVisiteRequest typeVisiteRequest);
    @DeleteMapping("/{id}")
    ResponseEntity<TypeVisiteResponse> deleteTypeVisite(@PathVariable UUID id);
    @GetMapping
    ResponseEntity<List<TypeVisiteResponse>> listTypesVisite();
}
