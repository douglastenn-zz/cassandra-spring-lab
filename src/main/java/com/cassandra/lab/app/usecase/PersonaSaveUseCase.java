package com.cassandra.lab.app.usecase;

import com.cassandra.lab.app.domain.Persona;

public interface PersonaSaveUseCase {
    Persona execute(Persona persona);
}
