package org.example;

import java.util.ArrayList;
import java.util.List;
import lombok.Getter;
import lombok.Setter;

public class Alumno {
    // Atributos
    @Getter @Setter
    private String nombre;
    @Getter @Setter
    private String apellido;
    @Getter @Setter
    private String legajo;
    @Getter @Setter
    private List<Materia> materiasAprobadas;

    // Constructor
    public Alumno(String nombre, String apellido) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.materiasAprobadas = new ArrayList<>();
    }

    // Métodos
    public void aprobarMateria(Materia materia){
        this.materiasAprobadas.add(materia);
    }

    public Boolean aproboMateria(Materia materia) {
        return materiasAprobadas.contains(materia);
    }

    public Boolean cumpleCorrelativas(Materia materia) {
        return materia.getCorrelativas().stream().allMatch(this::aproboMateria);
    }
}
