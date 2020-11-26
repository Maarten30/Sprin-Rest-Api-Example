package com.humanCompilers.presentacionSpring.api;

import com.humanCompilers.presentacionSpring.model.Persona;
import com.humanCompilers.presentacionSpring.service.PersonaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequestMapping("/api")
@RestController
public class ApiController {

    private PersonaService personaService;

    @Autowired
    public ApiController(PersonaService personaService) {
        this.personaService = personaService;
    }

    @GetMapping("/")
    public String index() {
        return "index";
    }

    @PostMapping("/addPersona")
    public Persona addPersona(@RequestBody Persona persona) {
        return personaService.addPersona(persona);
    }

    @GetMapping("/personas")
    public List<Persona> getPersonas() {
        return personaService.getAllPersona();
    }
}
