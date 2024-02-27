package com.ecole221.gestion_visite_entreprise.web.dto.response;

import java.util.List;
//interface fonctionnelle standard function apply
public interface RestResponse<E1,R1>{
    R1 toResponse(E1 entity);

     List<R1> toResponseList(List<E1> list) ;
}
