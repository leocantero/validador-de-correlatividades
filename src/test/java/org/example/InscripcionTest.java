package org.example;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class InscripcionTest {

    @Test
    @DisplayName("Inscripción aprobada o no")
    void aprobada() {
        Alumno alumno = new Alumno("Juan", "Pérez");
        Materia ayed = new Materia("Algoritmos y Estructuras de Datos");
        Materia am1 = new Materia("Análisis Matemático 1");
        Materia pdp = new Materia("Paradigmas de Programación");
        Materia am2 = new Materia("Análisis Matemático 2");
        Materia dsi = new Materia("Diseño de Sistemas de Información");
        pdp.agregarCorrelativa(ayed);
        dsi.agregarCorrelativa(pdp);
        am2.agregarCorrelativa(am1);
        alumno.aprobarMateria(ayed);
        alumno.aprobarMateria(pdp);
        Inscripcion inscripcion = new Inscripcion(alumno);
        Inscripcion otraInscripcion = new Inscripcion(alumno);
        inscripcion.agregarMateria(dsi);
        otraInscripcion.agregarMateria(am2);

        assertTrue(inscripcion.aprobada());
        assertFalse(otraInscripcion.aprobada());
    }
}