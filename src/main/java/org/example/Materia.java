package org.example;

import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

public class Materia {
    // Atributos
    @Getter @Setter
    private String nombre;
    @Getter @Setter
    private String codigo;
    @Getter @Setter
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

