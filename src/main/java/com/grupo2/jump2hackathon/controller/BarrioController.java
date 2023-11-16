package com.grupo2.jump2hackathon.controller;

import com.grupo2.jump2hackathon.documents.Barrio;
import com.grupo2.jump2hackathon.service.BarrioService;
import lombok.RequiredArgsConstructor;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/barrio")
@RequiredArgsConstructor
public class BarrioController {
    private final BarrioService barrioService;

    @GetMapping()
    public List<Barrio> getBarrios(){
        return barrioService.barriosPrueba();
    }
}
