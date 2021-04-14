package com.utn.spring.controller;

import com.utn.spring.model.Persona;
import com.utn.spring.service.PersonaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/Persona")
public class PersonaController
{
    @Autowired
    private PersonaService personaService;

    @PostMapping
    public void addPerson(@RequestBody Persona persona)
    {
        personaService.addPerson(persona);
    }

    @GetMapping("{/id}")
    public Persona getPersonById(@PathVariable String id)
    {
        return personaService.getPersonById(id);
    }

    @GetMapping
    public List<Persona>getAll()
    {
        return personaService.getAll();
    }

    @DeleteMapping("{/id}")
    public void deletePerson(@PathVariable String id)
    {
        personaService.deletePerson(id);
    }

    @PutMapping("/{id}/jugadres/{idJugador}")
    public void addJugador(@PathVariable String id, @PathVariable String idJugador)
    {
        personaService.addJugador(id,idJugador);
    }
}
