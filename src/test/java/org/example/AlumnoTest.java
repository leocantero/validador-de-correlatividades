package org.example;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class AlumnoTest {
    Alumno alumno = new Alumno("Juan", "Pérez");
    Materia ayed = new Materia("Algoritmos y Estructuras de Datos");
    Materia pdp = new Materia("Paradigmas de Programación");
    Materia dsi = new Materia("Diseño de Sistemas de Información");
    {
        alumno.aprobarMateria(ayed);
        pdp.agregarCorrelativa(ayed);
        dsi.agregarCorrelativa(pdp);
    }

    @Test
    @DisplayName("El alumno aprobó o no tal materia")
    void aproboMateria() {
        assertTrue(alumno.aproboMateria(ayed));
        assertFalse(alumno.aproboMateria(pdp));
    }

    @Test
    @DisplayName("El alumno cumple o no con las correlativas de tal materia")
    void cumpleCorrelativas(){
        assertTrue(alumno.cumpleCorrelativas(ayed));
        assertFalse(alumno.cumpleCorrelativas(dsi));
    }
}