package com.example.routes;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Routs {
//    @GetMapping("/")
    @RequestMapping(value = "/" , method = RequestMethod.GET)
    public String routes(){
        return "hello batata";
    }

}
