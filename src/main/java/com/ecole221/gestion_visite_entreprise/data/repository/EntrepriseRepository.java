package com.ecole221.gestion_visite_entreprise.data.repository;

import com.ecole221.gestion_visite_entreprise.data.model.Entreprise;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public interface EntrepriseRepository extends JpaRepository<Entreprise, UUID> {
}
