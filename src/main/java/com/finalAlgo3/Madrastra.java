package com.finalAlgo3;

public class Madrastra extends Personaje {
    private int puntosDeMagia;

    public Madrastra() {
        super();
        this.puntosDeMagia = 100;
    }

    public void realizarHechizo(Hechizo hechizo, Personaje personaje) {
        return;
    }

    @Override
    public void recibirDanio(int puntosDeEnergia, int puntosDeMagia) {
        this.puntosDeEnergia -= puntosDeEnergia;
        this.puntosDeMagia -= puntosDeMagia;
    }

    public int getPuntosDeMagia() {
        return this.puntosDeMagia;
    }
}
