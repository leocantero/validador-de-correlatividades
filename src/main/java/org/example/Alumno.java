package org.example;

import java.util.ArrayList;
import java.util.List;
import lombok.Getter;
import lombok.Setter;

@Getter @Setter
public class Alumno {
    // Atributos
    private String nombre;
    private String apellido;
    private String legajo;
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
