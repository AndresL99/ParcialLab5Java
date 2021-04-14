package com.utn.spring.model;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import java.util.List;

@Data
@NoArgsConstructor
@Entity
public class Representante extends Persona
{
    private List<Jugador>jugadores;
    private Float pesoDeLaBoveda;
    private Float montoTotal;

    @Override
    public TypePerson typePerson() {
        return TypePerson.REPRESENTANTE;
    }
}
