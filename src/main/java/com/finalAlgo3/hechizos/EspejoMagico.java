package com.finalAlgo3.hechizos;

import com.finalAlgo3.personajes.*;

public class EspejoMagico extends Hechizo {
    private final Personaje madrastra;

    public EspejoMagico(Personaje madrastra) {
        this.poderMagico = 0;
        this.madrastra = madrastra;
    }

    @Override
    public void realizarEfecto(Personaje personaje) {
        this.energia = this.madrastra.getPoderMagico();
        personaje.recibirDanio(energia, poderMagico);
    }
}
