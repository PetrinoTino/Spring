package com.javaTirane42.sda_spring_frmework_java_tr_42.thymeleaf;

import org.springframework.stereotype.Controller;

@Controller
public class MVCUserController {
    private MVCUserController mvcUserController;

    public MVCUserController(MVCUserController mvcUserController) {
        this.mvcUserController = mvcUserController;
    }
}
