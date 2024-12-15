package com.javaTirane42.sda_spring_frmework_java_tr_42.exceptionhandler;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GlobalExceptionController {
    @GetMapping("global-sda")
    public void runGlobalSda(){
        throw new SdaException("Global SDA Exception");
    }
    @GetMapping("global-specific")
    public void runGlobalSpecific(){
        throw new SpecificSdaException("Global SDA Exception");
    }
}
