package com.nest.studentapp_backend.controller;

import com.nest.studentapp_backend.dao.StudentDao;
import com.nest.studentapp_backend.model.Students;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class StudentController {
    @Autowired
    private StudentDao dao;

    @CrossOrigin(origins = "*")
    @GetMapping("/")
    public  String WebPage()
    {
        return "welcome to my website";

    }
    @CrossOrigin(origins = "*")
    @PostMapping(path="/add",consumes = "application/json",produces = "application/json")
    public String AddStudent(@RequestBody Students s)
    {
        dao.save(s);
        System.out.println(s.toString());
        return "student entry";
    }

    @CrossOrigin(origins = "*")
    @GetMapping(path = "/view")
    public List<Students> viewStudents()
    {
        return (List<Students>) dao.findAll();
    }





}
