package com.javaTirane42.sda_spring_frmework_java_tr_42.validation;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.validation.Valid;
import jakarta.validation.constraints.AssertTrue;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotNull;
import org.hibernate.validator.constraints.Length;
import org.springframework.validation.annotation.Validated;

 @Validated

 public class Person {
    @NotNull
    @Length(min = 3,max = 32)
    private String firstname;
    @Email
    private String email;
    private  String address;
    @JsonIgnore  // fsheh dokumentin json per te mos u shfaqur ne web
    @AssertTrue
    public boolean isAddressValid(){
        return  address != null && address.split(" ").length >=2;
    }
    public Person(String firstname, String email, String address) {
        this.firstname = firstname;
        this.email = email;
        this.address = address;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}
