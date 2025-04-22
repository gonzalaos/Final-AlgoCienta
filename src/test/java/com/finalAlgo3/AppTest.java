package com.finalAlgo3;

import static org.junit.jupiter.api.Assertions.*;
import com.finalAlgo3.personajes.*;
import com.finalAlgo3.hechizos.*;
import org.junit.jupiter.api.Test;
import java.util.*;

public class AppTest {
     @Test
     public void test02AlgoCientaAtacaAMadrastraConMagia() {
         List<Hechizo> hechizos = new ArrayList<Hechizo>();
         hechizos.add(new Magia());
         Personaje algoCienta = new AlgoCienta(hechizos);
         Personaje madrastra = new Madrastra();
        
         algoCienta.realizarHechizo(madrastra);
         assertEquals(80, madrastra.getEnergia());
         assertEquals(70, madrastra.getPoderMagico());
         assertEquals(30, algoCienta.getEnergia());
     }
}
