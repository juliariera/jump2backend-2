package com.grupo2.jump2hackathon.documents;

import lombok.Data;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.UUID;

@Document(collection = "barrios")
@Data
public class Barrio {
    private UUID uuid;
    private String nombre;
    private String comuna;
}
