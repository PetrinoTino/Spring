package com.javaTirane42.sda_spring_frmework_java_tr_42.scopes;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FirstController {

    private RandomNumberProvider randomNumberProvider;

    public FirstController(RandomNumberProvider randomNumberProvider) {
        this.randomNumberProvider = randomNumberProvider;
    }

    @GetMapping("/api/number/val-a")
    public Integer showFirstNumber() {
        return randomNumberProvider.getValue();
    }

}
