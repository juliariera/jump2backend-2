package com.grupo2.jump2hackathon.repository;

import com.grupo2.jump2hackathon.documents.Barrio;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.UUID;

public interface BarrioRepository extends MongoRepository<Barrio, UUID> {
}
