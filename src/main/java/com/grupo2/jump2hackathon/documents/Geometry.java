package com.grupo2.jump2hackathon.documents;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;


@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Geometry {

    private List<List<Float>>coordinates;
    private String type;
}
