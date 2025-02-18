package com.finalAlgo3;

public abstract class Personaje {
    protected int puntosDeEnergia;

    public Personaje() {
        this.puntosDeEnergia = 100;
    }

    public abstract void recibirDanio(int puntosDeEnergia, int puntosDeMagia);

    public int getPuntosDeEnergia() {
        return this.puntosDeEnergia;
    }
}
