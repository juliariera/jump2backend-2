package com.grupo2.jump2hackathon.controller;

import lombok.Getter;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/barrio")
public class BarrioController {

    @GetMapping()
    public String getBarrios(){
        return "Hello World";
    }
}
