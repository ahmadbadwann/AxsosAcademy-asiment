package com.example.burgertracker1.controllers;


import com.example.burgertracker1.models.Burger;
import com.example.burgertracker1.repositories.BurgerRepository;
import com.example.burgertracker1.services.BurgesServices;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.validation.ValidationAutoConfiguration;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
public class BurgerController {

    @Autowired
    BurgesServices burgesServices;
    @Autowired
    private ValidationAutoConfiguration validationAutoConfiguration;

    @GetMapping("/")
    public String index(@ModelAttribute("burger") Burger burger , Model model){
        List<Burger> burgers = burgesServices.findAll();
        model.addAttribute("burgers",burgers);
        return "index.jsp";

    }
    @PostMapping("/burgers")
    public String create(@Valid @ModelAttribute("burger") Burger burger,
                         BindingResult result, Model model){
        if (result.hasErrors()){
            model.addAttribute("burgers",burgesServices.findAll());
            return "index.jsp";
        }else{
            burgesServices.createBurger(burger);
            return "redirect:/";
        }
    }
    @GetMapping("/burgers/delete/{id}")
    public String delete(@PathVariable("id") Integer id){
        Burger found=burgesServices.findbyid(id);
        if(found!=null){
            burgesServices.delete(found);
            return "redirect:/";
        }else {
            return "redirect:/";
        }
    }
    @GetMapping("/burgers/show/{id}")
    public String show(@PathVariable("id") long id, Model model){
        Burger found=burgesServices.findbyid(id);
        if(found!=null){
            model.addAttribute("burger",found);
            return "show.jsp";
        }else {
            return "redirect:/";
        }

    }
    @GetMapping("/burgers/edit/{id}")
    public String edit(@PathVariable("id") long id,Model model){
        Burger found=burgesServices.findbyid(id);
        if (found==null){
            return "redirect:/";
        }else{
            model.addAttribute("burger",found);
            return "edit.jsp";
        }
    }
    @PostMapping("/burgers/update/{id}")
    public String update(@PathVariable("id") long id,
                         @Valid @ModelAttribute("burger")  Burger burger,
                         BindingResult result,
                         Model model) {
        if (result.hasErrors()) {
            return "edit.jsp";
        }else {
            Burger found=burgesServices.findbyid(id);
            if (found==null){
                return "redirect:/";
            }else{
                found.setBurgername(burger.getBurgername());
                found.setRestaurantname(burger.getRestaurantname());
                found.setRating(burger.getRating());
                found.setNotes(burger.getNotes());
                burgesServices.updateBurger(found);
                return "redirect:/";
            }
        }
    }



}
