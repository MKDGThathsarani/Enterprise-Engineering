package org.example.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping
public class TeacherController {

    @RequestMapping
    public String getTeacherName(){
        return "Teacher Sarath";
    }
}
