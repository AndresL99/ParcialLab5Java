package com.utn.spring.service;

import com.utn.spring.model.Jugador;
import com.utn.spring.model.Persona;
import com.utn.spring.model.Representante;
import com.utn.spring.repository.PersonaRepository;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.client.HttpClientErrorException;

import java.util.List;

@Service
public class PersonaService
{
    private PersonaRepository personaRepository;
    //private CurrencyService currencyService;

    public void addPerson(Persona p)
    {
        personaRepository.save(p);
    }

    public Persona getPersonById(String id)
    {
        return personaRepository.findById(id).orElseThrow(()-> new HttpClientErrorException(HttpStatus.NOT_FOUND));
    }

    public List<Persona>getAll()
    {
        return personaRepository.findAll();
    }

    public void addJugador(String id, String idJugador)
    {
        Persona persona = getPersonById(id);
        persona.typePerson().find("Jdugador");
        personaRepository.save(persona);

    }

    public void deletePerson(String id)
    {
        personaRepository.deleteById(id);
    }
}
