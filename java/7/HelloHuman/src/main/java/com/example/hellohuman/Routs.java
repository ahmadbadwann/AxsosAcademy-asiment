package com.example.hellohuman;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Routs {


    @RequestMapping("/")
    public String Helloname(@RequestParam(value = "q", required = false) String name,
                            @RequestParam(value = "c", required = false) String lastname) {
        if (name == null & lastname == null) {
            return "Hello human";
        }else {
            return "Hello " + name + " " + lastname;
        }
    }
}
