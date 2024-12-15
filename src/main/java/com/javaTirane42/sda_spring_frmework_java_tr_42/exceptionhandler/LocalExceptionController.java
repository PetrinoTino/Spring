package com.javaTirane42.sda_spring_frmework_java_tr_42.exceptionhandler;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LocalExceptionController {
    @GetMapping("resources")
    public void showResources(){
        throw  new SdaException("Resource Exception");
    }
}
