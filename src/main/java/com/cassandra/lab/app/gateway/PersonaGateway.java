package com.cassandra.lab.app.gateway;

import com.cassandra.lab.app.domain.Persona;

public interface PersonaGateway {
    Persona save(Persona persona);
}
