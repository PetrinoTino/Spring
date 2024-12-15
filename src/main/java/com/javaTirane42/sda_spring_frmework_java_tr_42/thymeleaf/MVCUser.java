package com.javaTirane42.sda_spring_frmework_java_tr_42.thymeleaf;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;

@Entity
@Table(name = "mvc_users")
public class MVCUser {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @NotBlank(message = "Name is mandatory")
}
