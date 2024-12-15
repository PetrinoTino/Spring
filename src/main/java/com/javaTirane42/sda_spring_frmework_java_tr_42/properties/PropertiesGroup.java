package com.javaTirane42.sda_spring_frmework_java_tr_42.properties;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@Component
@ConfigurationProperties(prefix="sda.java.tirane42")
public class PropertiesGroup {
private String propertyA;
private String PropertyB;


    public String getPropertyA() {
        return propertyA;
    }

    public void setPropertyA(String propertyA) {
        this.propertyA = propertyA;
    }

    public String getPropertyB() {
        return PropertyB;
    }

    public void setPropertyB(String propertyB) {
        PropertyB = propertyB;
    }
}
