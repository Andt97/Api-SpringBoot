package com.anth.ecommerce.backend.advice;

import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import java.util.HashMap;
import java.util.Map;

@RestControllerAdvice
public class ProductControllerAdvice {

    @ExceptionHandler(MethodArgumentNotValidException.class)
    public Map<String,String> handleFieldErrors(MethodArgumentNotValidException exception){
        Map<String,String> erros=new HashMap<>();
        exception.getBindingResult().getFieldErrors().forEach(error->{
            erros.put(error.getField(),error.getDefaultMessage());
        });
        return erros;
    }
}
