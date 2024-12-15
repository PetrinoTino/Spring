package com.javaTirane42.sda_spring_frmework_java_tr_42.validation;


import jakarta.validation.Valid;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ValidationController {

    @PostMapping("person")
    public Person addPerson (@Valid @RequestBody  Person person){
        return person;
    }
}
