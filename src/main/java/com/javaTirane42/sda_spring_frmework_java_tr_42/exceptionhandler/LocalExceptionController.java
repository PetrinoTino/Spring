package com.javaTirane42.sda_spring_frmework_java_tr_42.exceptionhandler;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LocalExceptionController {

    @GetMapping("resources")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void showResources() {
        throw new SdaException("Resource Exception");
    }

    @GetMapping("resources/directory")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void showDirectory() {
        throw new SpecificSdaException("Directory Exception");
    }

    @ResponseStatus(HttpStatus.BAD_REQUEST)
    @ExceptionHandler(SdaException.class)
    public Error handleSdaException(SdaException e) {
        return new Error(e.getMessage());
    }

    @ResponseStatus(HttpStatus.BAD_REQUEST)
    @ExceptionHandler(SpecificSdaException.class)
    public Error handleSpecificSdaException(SpecificSdaException e) {
        return new Error(e.getMessage());
    }

}


























