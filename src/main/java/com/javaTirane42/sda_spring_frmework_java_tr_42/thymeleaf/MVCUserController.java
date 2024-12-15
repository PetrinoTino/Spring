package com.javaTirane42.sda_spring_frmework_java_tr_42.thymeleaf;


import jakarta.validation.Valid;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class MVCUserController {

    private MVCUserRepository mvcUserRepository;

    public MVCUserController(MVCUserRepository mvcUserRepository) {
        this.mvcUserRepository = mvcUserRepository;
    }

    @GetMapping("/signup")
    public String showSignUpForm(MVCUser user) {
        return "add-user";
    }

    @PostMapping("/adduser")
    public String addUser(@Valid MVCUser user, BindingResult bindingResult, Model model) {
        if (bindingResult.hasErrors()) {
            return "add-user";
        }

        mvcUserRepository.save(user);
        return "redirect:/index";
    }

    @GetMapping("/index")
    public String showUserList(Model model) {
        model.addAttribute("users", mvcUserRepository.findAll());
        return "index";
    }
}
























