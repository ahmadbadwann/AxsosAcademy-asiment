package com.example.simplereceiptt.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {

    @RequestMapping("/")
    public String index(Model model) {

        String name = "Alan Turing";
        String itemName = "Silver Cable";
        double price = 7.99;
        String description = "High-quality metal wire used for experiments.";
        String vendor = "Tech Supplies Store";


        model.addAttribute("name", name);
        model.addAttribute("itemName", itemName);
        model.addAttribute("price", price);
        model.addAttribute("description", description);
        model.addAttribute("vendor", vendor);

        return "index.jsp";
    }
}
