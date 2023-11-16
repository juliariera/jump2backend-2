package com.grupo2.jump2hackathon.service;

import com.grupo2.jump2hackathon.repository.BarrioRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class BarrioService {
    private final BarrioRepository barrioRepository;
}
