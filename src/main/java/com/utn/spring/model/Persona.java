package com.utn.spring.model;

import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.AccessType;

import javax.persistence.*;
import java.util.List;

@Data
@NoArgsConstructor
@Entity
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME,property = "typePerson",visible = true)
@JsonSubTypes({
        @JsonSubTypes.Type(value = Jugador.class, name = "Jugador"),
        @JsonSubTypes.Type(value = Representante.class, name = "Representante")
})
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
public abstract class Persona
{
    @Id
    private String id;
    private String name;
    private String lastName;

    @AccessType(AccessType.Type.PROPERTY)
    public abstract TypePerson typePerson();

    @OneToMany(fetch = FetchType.EAGER)
    @JoinColumn(name = "jugador_id")
    List<Jugador>jugadorList;
}
