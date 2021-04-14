package com.utn.spring.model;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import java.util.Date;

@Entity
@Data
@NoArgsConstructor
public class Jugador extends Persona
{
    private Float peso;
    private Integer altura;
    private Integer goles;
    private Integer minutosJugados;
    private Currency currency;
    private Date fechaNacimiento;

    @Override
    public TypePerson typePerson() {
        return TypePerson.JUGADOR;
    }
}
