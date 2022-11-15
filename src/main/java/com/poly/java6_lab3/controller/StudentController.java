package com.poly.java6_lab3.controller;

import com.poly.java6_lab3.bean.Student;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class StudentController {
    @GetMapping("/student/form")
    public String index(Model model){
        Student student = new Student();
        student.setFullname("Thai An");
        student.setCountry("VN");
        student.setGender(false);
        model.addAttribute("sv",student);
        return "student/form";
    }
    @PostMapping("/student/save")
    public String save(@ModelAttribute("sv") Student form){
        return "student/KQ";
    }
}
