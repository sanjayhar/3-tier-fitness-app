package com.example.fitness.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FitnessController {
    @GetMapping("/api/hello")
    public String greet() {
        return "Welcome to the Fitness App Backend!";
    }
}
