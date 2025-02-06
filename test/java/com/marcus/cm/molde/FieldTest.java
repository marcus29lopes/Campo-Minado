package com.marcus.cm.molde;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;


import static org.junit.jupiter.api.Assertions.*;

public class FieldTest {

    private Field field;

    @BeforeEach
        //executado antes de cada teste, vai criar um novo campo antes de cada teste
    void iniciarCampo() {
        field = new Field(3, 3);
    }

    @Test
    void testeVizinhoRealDistancia1() {
        Field vizinho = new Field(3, 2);
        boolean resultado = field.addNeighbor(vizinho);
        assertTrue(resultado);
    }

    @Test
    void testeVizinhoRealDistanciaDiagonal() {
        Field vizinho = new Field(2, 2);
        boolean resultado = field.addNeighbor(vizinho);
        assertTrue(resultado);
    }

    @Test
    void testeVizinhoNaoVizinho() {
        Field vizinho = new Field(3, 2);
        boolean resultado = field.addNeighbor(vizinho);
        assertTrue(resultado);
    }


}
