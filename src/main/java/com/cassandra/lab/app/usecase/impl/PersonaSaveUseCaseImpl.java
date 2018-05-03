package com.cassandra.lab.app.usecase.impl;

import com.cassandra.lab.app.domain.Persona;
import com.cassandra.lab.app.gateway.PersonaGateway;
import com.cassandra.lab.app.usecase.PersonaSaveUseCase;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class PersonaSaveUseCaseImpl implements PersonaSaveUseCase {

    private final PersonaGateway personaGateway;

    public Persona execute(final Persona persona) {
        return this.personaGateway.save(persona);
    }
}
