package com.ecole221.gestion_visite_entreprise.web.dto.request;
@FunctionalInterface
//functionnal interface standard identity
public interface RestRequest<E1> {
    E1 toEntity();

}
