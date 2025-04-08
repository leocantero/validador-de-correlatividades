package org.example;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MateriaTest {

    @Test
    @DisplayName("Agregar correlativa")
    void agregarCorrelativa() {
        Materia ayed = new Materia("Algoritmos y Estructuras de Datos");
        Materia pdp = new Materia("Paradigmas de Programación");
        pdp.agregarCorrelativa(ayed);

        assertTrue(pdp.getCorrelativas().contains(ayed));
    }
}