package com.grupo2.jump2hackathon.service;

import com.grupo2.jump2hackathon.documents.Poligono;
import com.grupo2.jump2hackathon.repository.PoligonoRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class PoligonoService {
    private final PoligonoRepository poligonoRepository;

    public List<Poligono> getAll() {
        return poligonoRepository.findAll();
    }
}
