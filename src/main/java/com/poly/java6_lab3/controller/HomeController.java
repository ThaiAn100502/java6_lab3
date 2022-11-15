package com.poly.java6_lab3.controller;

import com.poly.java6_lab3.bean.Student;
import com.poly.java6_lab3.bean.StudentValidation;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class HomeController {
    @GetMapping("/home/index")
    public String home(Model model){
        return "home/index";
    }
    @GetMapping("/home/about")
    public String about(Model model){
        return "home/about";
    }

}
