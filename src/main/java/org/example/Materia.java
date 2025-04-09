package org.example;

import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

@Getter @Setter
public class Materia {
    // Atributos
    private String nombre;
    private String codigo;
    private List<Materia> correlativas;

    // Constructor
    public Materia(String nombre) {
        this.nombre = nombre;
        this.correlativas = new ArrayList<>();
    }

    // Métodos
    public void agregarCorrelativa(Materia materia) {
        correlativas.add(materia);
    }
}

