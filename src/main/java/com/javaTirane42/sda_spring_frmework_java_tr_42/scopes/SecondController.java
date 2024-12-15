package com.javaTirane42.sda_spring_frmework_java_tr_42.scopes;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SecondController {

    private RandomNumberProvider randomNumberProvider;

    public SecondController(RandomNumberProvider randomNumberProvider) {
        this.randomNumberProvider = randomNumberProvider;
    }

    @GetMapping("/api/number/val-b")
    public Integer fetchSecondNumber() {
        return randomNumberProvider.getValue();
    }
}