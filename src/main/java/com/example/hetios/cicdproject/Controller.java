package com.example.hetios.cicdproject;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {

    @GetMapping("/message")
    public String message() {
        return "Hello World!";
    }
}
