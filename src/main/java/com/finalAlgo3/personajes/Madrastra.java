package com.finalAlgo3.personajes;

public class Madrastra extends Personaje {
    private final EstadoMadrastra estado;

    public Madrastra() {
        this.poderMagico = 100;
        this.estado = new Natural(this);
    }

    @Override
    public void realizarHechizo(Personaje algoCienta) {
        estado.realizarHechizo(algoCienta);
    }
}
