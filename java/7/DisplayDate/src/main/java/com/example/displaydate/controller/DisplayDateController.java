package com.example.displaydate.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DisplayDateController {
    @Controller
    public static class DisplayDateController1 {
        @RequestMapping("/")
        public String dashboard() {
            return "dashboard"; // dashboard.jsp
        }

        @RequestMapping("/date")
        public String showDate(Model model) {
            Date now = new Date();
            SimpleDateFormat sdf = new SimpleDateFormat("EEEE, MMMM d, yyyy");
            model.addAttribute("currentDate", sdf.format(now));
            return "date"; // date.jsp
        }

        @RequestMapping("/time")
        public String showTime(Model model) {
            Date now = new Date();
            SimpleDateFormat sdf = new SimpleDateFormat("HH:mm:ss");
            model.addAttribute("currentTime", sdf.format(now));
            return "time"; // time.jsp
        }
    }
}
