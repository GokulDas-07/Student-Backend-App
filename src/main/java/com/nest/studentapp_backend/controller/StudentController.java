package com.nest.studentapp_backend.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
@RestController
public class StudentController {
    @GetMapping("/")
    public  String HomePage()
    {
        return "welcome to my website";

    }



    @GetMapping("/contact")
    public String ContactPage()
    {
        return "welcome to contact page";
    }


}
