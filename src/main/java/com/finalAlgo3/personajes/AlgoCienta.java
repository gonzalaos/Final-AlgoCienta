package com.finalAlgo3.personajes;

import com.finalAlgo3.hechizos.*;
import java.util.List;

public class AlgoCienta extends Personaje {
    private final List<Hechizo> hechizos;

    public AlgoCienta(List<Hechizo> hechizos) {
        this.poderMagico = 0;
        this.hechizos = hechizos;
    }       

    @Override
    public void realizarHechizo(Personaje madrastra) {
        for (Hechizo hechizo : hechizos) {
            hechizo.realizarEfecto(madrastra);
        }
        madrastra.realizarHechizo(this);
    }
}
