package com.example.counter;

import jakarta.servlet.http.HttpSession;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Controller
public class Counter {
    @RequestMapping("/")
    public String index(HttpSession session) {
        if(session.getAttribute("count")==null){
            session.setAttribute("count",0);
        }else{
            int x=(int) session.getAttribute("count")+1;
            session.setAttribute("count",x);
        }
        return "index.jsp";
    }
    @RequestMapping("/counter")
    public String counter() {
        return "Counter.jsp";
    }
}
