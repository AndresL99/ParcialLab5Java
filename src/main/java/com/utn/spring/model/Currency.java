package com.utn.spring.model;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.List;

@Data
@NoArgsConstructor
@Entity
public class Currency
{
    @Id
    private String id;
    private String currency;
    private Integer monto;

    @OneToMany(fetch = FetchType.EAGER)
    @JoinColumn(name = "id_person")
    List<Persona>personaList;
}
