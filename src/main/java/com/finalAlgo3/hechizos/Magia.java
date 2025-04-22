package com.finalAlgo3.hechizos;

import com.finalAlgo3.personajes.*;

public class Magia extends Hechizo {
    public Magia() {
        this.energia = 20;
        this.poderMagico = 30;
    }

    @Override
    public void realizarEfecto(Personaje personaje) {
        personaje.recibirDanio(energia, poderMagico);
    }
}
