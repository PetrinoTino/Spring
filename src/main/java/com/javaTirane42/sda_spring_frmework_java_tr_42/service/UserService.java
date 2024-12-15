package com.javaTirane42.sda_spring_frmework_java_tr_42.service;

import com.javaTirane42.sda_spring_frmework_java_tr_42.entity.User;
import com.javaTirane42.sda_spring_frmework_java_tr_42.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;
@Service
public class UserService {

    //  Constructor
    private UserRepository userRepository;

    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

/*
    -- Autowired
    @Autowired
    private UserRepository userRepository;*/
/*
    -- Setter
    private UserRepository userRepository;

    @Autowired
    public void setUserRepository(UserRepository userRepository) {
        this.userRepository = userRepository;
    }*/

    public List<User> getAllUsers() {
        return userRepository.findAll();
    }

    public User getUserById(Long id) {
        return userRepository.findById(id)
                .orElse(null);
    }

    public User createUser(User user) {
        User newUser = new User();
        newUser.setUsername(user.getUsername());
        newUser.setPassword(user.getPassword());
        return userRepository.save(newUser);
    }

    public User updateUser(User user) {
        return userRepository.save(user);
    }

    public void deleteUser(Long id) {
        userRepository.deleteById(id);
    }
}