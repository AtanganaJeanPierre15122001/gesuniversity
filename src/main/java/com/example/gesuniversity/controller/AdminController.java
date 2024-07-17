package com.example.gesuniversity.controller;

import com.example.gesuniversity.model.Cours;
import com.example.gesuniversity.service.Serv.CoursService;
import com.example.gesuniversity.service.impl.CoursServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;


@Controller
public class AdminController {


    @Autowired
    private CoursService coursService;

    @GetMapping("/admin")
    public String  viewLoginPage(Model model){

        model.addAttribute("listCourss",coursService.getAllCours());

        return "index";

    }

    @GetMapping("/showNewCoursForm")
    public  String showNewCoursForm(Model model){
        Cours cours = new Cours();
        model.addAttribute("cours",cours);
        return "remp-cours";
    }

    @PostMapping("/saveCours")
    public String saveCours(@ModelAttribute("cours") Cours cours){

        coursService.saveCours(cours);
        return "redirect:/admin";
    }

    @GetMapping("/showFormForUpdate/{id}")
    public String showFormForUpdate(@PathVariable( value = "id") long id, Model model) {


        Cours cours = coursService.getCoursById(id);


        model.addAttribute("cours", cours);
        return "update-cours";
    }

    @GetMapping("/deleteCours/{id}")
    public String deleteEmployee(@PathVariable(value = "id") long id) {

        // call delete employee method
        this.coursService.deleteCoursById(id);
        return "redirect:/admin";

    }

    @GetMapping("/error")
    public String errorpage(Model model){
        return "error-page";
    }


}
