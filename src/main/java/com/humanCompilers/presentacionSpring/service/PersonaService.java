package com.humanCompilers.presentacionSpring.service;

import com.humanCompilers.presentacionSpring.model.Persona;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class PersonaService {

    private List<Persona> personas_db = new ArrayList<>();

    public Persona addPersona(Persona personaNueva) {
        personas_db.add(personaNueva);
        return personas_db.get(personas_db.size() - 1);
    }

    public List<Persona> getAllPersona() {
        return personas_db;
    }
}
