package com.example.emplo1.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@Controller
public class EmployeeController {

    @GetMapping("/")
    public String getStringUp(){
        return "up";
    }
}
