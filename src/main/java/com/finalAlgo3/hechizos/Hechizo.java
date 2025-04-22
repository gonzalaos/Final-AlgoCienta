package com.finalAlgo3.hechizos;

import com.finalAlgo3.personajes.*;

public abstract class Hechizo {
    protected int energia;
    protected int poderMagico;

    public abstract void realizarEfecto(Personaje personaje);
}
