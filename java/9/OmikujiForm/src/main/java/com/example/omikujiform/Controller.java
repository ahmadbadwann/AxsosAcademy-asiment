package com.example.omikujiform;

import jakarta.servlet.http.HttpSession;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

@org.springframework.stereotype.Controller
public class Controller {
    @GetMapping("/amikuji")
    public String amikuji(){
        System.out.println("amikuji");
        return "index.jsp";
    }
    @PostMapping("/supmit")
    public String supmit(HttpSession session ,
                         @RequestParam("number") int number,
                         @RequestParam("person") String person,
                         @RequestParam("hobby") String hobby,
                         @RequestParam("living") String living,
                         @RequestParam("nice") String nice, RedirectAttributes redirectAttributes){
        return "redirect:/ghj";
    }
    @RequestMapping("/ghj")
    public String index(HttpSession session){
        System.out.println("disebly");
        return "disebly.jsp";
    }
}
