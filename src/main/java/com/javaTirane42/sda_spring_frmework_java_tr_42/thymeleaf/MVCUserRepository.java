package com.javaTirane42.sda_spring_frmework_java_tr_42.thymeleaf;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository

public interface MVCUserRepository extends JpaRepository <MVCUser,Long> {

}
