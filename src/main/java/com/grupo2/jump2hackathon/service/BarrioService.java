package com.grupo2.jump2hackathon.service;

import com.grupo2.jump2hackathon.documents.Barrio;
import com.grupo2.jump2hackathon.documents.Poligono;
import com.grupo2.jump2hackathon.repository.BarrioRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.UUID;

@Service
@RequiredArgsConstructor
public class BarrioService {
    private final BarrioRepository barrioRepository;

    public List<Barrio> barriosPrueba(){
        List<List<Float>> coordinates = new ArrayList<>();

        coordinates.add(Arrays.asList(21.51169462836208f, 7.932419335180526f));
        coordinates.add(Arrays.asList(22.067294335999975f, 7.875348950507757f));
        coordinates.add(Arrays.asList(21.989098821592393f, 7.491961159412995f));
        coordinates.add(Arrays.asList(21.48700130802186f, 7.581721106034706f));
        coordinates.add(Arrays.asList(21.51169462836208f, 7.924266906668848f));

        Poligono poligon = Poligono.builder()
                .type("Polygon")
                .coordinates(coordinates)
                .build();

        Barrio barrio = Barrio.builder()
                .nombre("Prueba")
                .poligono(poligon)
                .uuid(UUID.randomUUID())
                .pMedioAlquiler(2500.5f)
                .pMedioVenta(2500.5f)
                .distrito("Distrito 1")
                .build();

        Barrio barrio2 = Barrio.builder()
                .nombre("Prueba 2")
                .uuid(UUID.randomUUID())
                .pMedioAlquiler(2500.5f)
                .pMedioVenta(2500.5f)
                .distrito("Distrito 2")
                .build();

        return List.of(barrio, barrio2);

    }
}
