package com.poly.java6_lab3.controller;

import com.poly.java6_lab3.bean.StudentValidation;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.Errors;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class ValidationController {
    @GetMapping("/validation/form")
    public String index(Model model){
        StudentValidation student = new StudentValidation();
        model.addAttribute("sv",student);
        return "student/formValidation";
    }
    @PostMapping("/validation/save")
    public String save (Model model, @Validated @ModelAttribute("sv") StudentValidation form, Errors errors){
        if (errors.hasErrors()){
            model.addAttribute("message","Vui lòng sửa các lỗi sau: ");
            return "student/formValidation";
        }
        return "student/KQ";
    }
}
