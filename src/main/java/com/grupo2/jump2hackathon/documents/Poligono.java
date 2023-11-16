package com.grupo2.jump2hackathon.documents;

import lombok.*;
import java.util.List;

@Data
@AllArgsConstructor
@Builder
public class Poligono {
    private String type;
    private Geometry geometry;
}
