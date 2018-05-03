package com.cassandra.lab.app.gateway.http;

import com.cassandra.lab.app.domain.Persona;
import com.cassandra.lab.app.usecase.PersonaSaveUseCase;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;

import static org.springframework.http.MediaType.APPLICATION_JSON_VALUE;

@RequiredArgsConstructor
@RestController
@RequestMapping(name = "/api/character/")
public class PersonaController {

    private final PersonaSaveUseCase personaSaveUseCase;

    @PostMapping(produces = APPLICATION_JSON_VALUE)
    public ResponseEntity<Persona> save(final @Valid @RequestBody Persona persona) {
        return new ResponseEntity<>(this.personaSaveUseCase.execute(persona), HttpStatus.CREATED);
    }
}
