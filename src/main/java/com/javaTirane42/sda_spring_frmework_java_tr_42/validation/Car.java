package com.javaTirane42.sda_spring_frmework_java_tr_42.validation;


import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import org.hibernate.validator.constraints.Length;

public class Car {
@NotEmpty
        private Long id;
@NotNull
@Length(min = 3)
        private String name;
@Min(1)
        private Integer wheelsNumber;

        public Car(Long id, String name, Integer wheelsNumber) {
            this.id = id;
            this.name = name;
            this.wheelsNumber = wheelsNumber;
        }

        public Long getId() {
            return id;
        }

        public void setId(Long id) {
            this.id = id;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public Integer getWheelsNumber() {
            return wheelsNumber;
        }

        public void setWheelsNumber(Integer wheelsNumber) {
            this.wheelsNumber = wheelsNumber;
        }
    }




