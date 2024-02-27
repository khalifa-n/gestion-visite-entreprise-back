package com.ecole221.gestion_visite_entreprise.web.exceptions.costumisation;

import lombok.Getter;
import org.springframework.http.HttpStatus;
@Getter
public class ApplicationException extends RuntimeException{
    private static final String KEY="field";
    private static final HttpStatus  httpStatus = HttpStatus.NOT_FOUND;

    public ApplicationException(String message) {
        super(message);
    }
}
