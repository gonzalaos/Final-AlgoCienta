package com.finalAlgo3.personajes;

public abstract class EstadoMadrastra {
    protected Personaje madrastra;

    public EstadoMadrastra(Personaje madrastra) {
        this.madrastra = madrastra;
    }

    public abstract void realizarHechizo(Personaje personaje);
}
