package org.example;

import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

@Getter @Setter
public class Inscripcion {
    // Atributos
    private Alumno alumno;
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
