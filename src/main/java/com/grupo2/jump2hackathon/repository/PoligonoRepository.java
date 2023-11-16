package com.grupo2.jump2hackathon.repository;

import com.grupo2.jump2hackathon.documents.Poligono;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface PoligonoRepository extends MongoRepository<Poligono, String> {
    @Query("{ 'properties.Codi_Barri' : ?0 }")
    Poligono findByCodiBarri(int codiBarri);
}
