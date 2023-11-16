package com.grupo2.jump2hackathon.documents;

import lombok.Builder;
import lombok.Data;
import org.bson.json.JsonObject;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.UUID;

@Document(collection = "barrio")
@Data
@Builder
public class Barrio {
    private UUID uuid;
    private String codiBarri;
    private String nomBarri;
    private String codiDistricte;
    private String nomDistricte;
    private Poligono poligono;
    private Integer nAltres;
    private Integer nAutomocio;
    private Integer nEquipamentPersonal;
    private Integer nLocalBuit;
    private Integer nOciCultura;
    private Integer nParamentLlar;
    private Integer nQuotidiaAlimentari;
    private Integer nQuotidiaNoAlimentari;
    private Integer nServeis;
}
