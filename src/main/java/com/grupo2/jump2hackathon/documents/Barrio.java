package com.grupo2.jump2hackathon.documents;

import lombok.Builder;
import lombok.Data;
import org.bson.json.JsonObject;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.UUID;

@Document(collection = "barrios")
@Data
@Builder
public class Barrio {
    private UUID uuid;
    private String nombre;
    private String distrito;
    private Float pMedioAlquiler;
    private Float pMedioVenta;
    private Poligono poligono;
}
