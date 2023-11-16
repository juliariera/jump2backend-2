package com.grupo2.jump2hackathon.documents;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

import java.util.List;

@Data
@AllArgsConstructor
@Builder
public class Poligono {
    private String type;
    private List<List<Float>> coordinates;
}
