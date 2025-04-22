package com.finalAlgo3.personajes;

import com.finalAlgo3.hechizos.*;

public class Natural extends EstadoMadrastra {
    private final Hechizo hechizo;

    public Natural(Personaje madrastra) {
        super(madrastra);
        this.hechizo = new EspejoMagico(this.madrastra);
    }

    @Override
    public void realizarHechizo(Personaje algoCienta) {
        hechizo.realizarEfecto(algoCienta);
    }
}
