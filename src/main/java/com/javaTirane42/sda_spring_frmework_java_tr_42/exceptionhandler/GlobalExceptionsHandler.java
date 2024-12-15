package com.javaTirane42.sda_spring_frmework_java_tr_42.exceptionhandler;


import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class GlobalExceptionsHandler {
@ExceptionHandler(SdaException.class)
    public Error handleSdaException(SdaException e){
    return new Error(e.getMessage());
}

}
