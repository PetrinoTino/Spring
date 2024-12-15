package com.javaTirane42.sda_spring_frmework_java_tr_42.repository;

import com.javaTirane42.sda_spring_frmework_java_tr_42.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository

public interface UserRepository extends JpaRepository<User, Long> {


}
