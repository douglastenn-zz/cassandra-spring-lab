package com.cassandra.lab.app.gateway.impl;

import com.cassandra.lab.app.domain.Persona;
import com.cassandra.lab.app.gateway.PersonaGateway;
import com.cassandra.lab.app.gateway.repository.PersonaRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class PersonaGatewayImpl implements PersonaGateway {

    private final PersonaRepository personaRepository;

    public Persona save(final Persona persona) {
        return this.personaRepository.save(persona);
    }
}
