package com.example.gesuniversity.controller;


import com.example.gesuniversity.model.Enseignant;
import com.example.gesuniversity.service.Serv.EnseignantService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class RegisterController {

    @Autowired
    private EnseignantService enseignantService;


    @GetMapping("/register")
    public String  viewRegisterPage(Model model){
        model.addAttribute("enseignant", new Enseignant());
        return "pages-register";
    }

    @PostMapping("/register")
    public String  registerUser(@ModelAttribute("enseignant") Enseignant enseignant){
        enseignantService.saveEnseignant(enseignant);
        return "index";
    }


}
