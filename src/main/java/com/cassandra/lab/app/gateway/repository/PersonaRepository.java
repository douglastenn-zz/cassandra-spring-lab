package com.cassandra.lab.app.gateway.repository;

import com.cassandra.lab.app.domain.Persona;
import org.springframework.data.cassandra.repository.CassandraRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public interface PersonaRepository extends CassandraRepository<Persona, UUID> {
}
