package org.example;

import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

public class Inscripcion {
    // Atributos
    @Getter @Setter
    private Alumno alumno;
    @Getter @Setter
    private List<Materia> materias;

    // Constructor
    public Inscripcion(Alumno alumno) {
        this.alumno = alumno;
        this.materias = new ArrayList<>();
    }

    // Métodos
    public Boolean aprobada(){
        return this.materias.stream().allMatch(materia->this.alumno.cumpleCorrelativas(materia));
    }
    public void agregarMateria(Materia materia){
        this.materias.add(materia);
    }
}
