package com.finalAlgo3;

import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.*;

import org.junit.jupiter.api.Test;

public class AppTest 
{
    @Test
    public void shouldAnswerWithTrue()
    {
        assertTrue( true );
    }

    @Test
    public void test01AlgoCientaAtacaAMadrastraConSabiduria() {
        List<Hechizo> hechizos = new ArrayList<Hechizo>();
        hechizos.add(new Sabiduria());
        AlgoCienta algoCienta = new AlgoCienta(hechizos);
        Madrastra madrastra = new Madrastra();
        
        algoCienta.realizarHechizo(madrastra);
        assertTrue(madrastra.getPuntosDeEnergia() == 50);
        assertTrue(madrastra.getPuntosDeMagia() == 0);
    }
}
