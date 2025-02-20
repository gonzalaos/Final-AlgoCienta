package com.finalAlgo3;

public abstract class Hechizo {
    protected int puntosDeEnergia;
    protected int puntosDeMagia;

    public abstract void realizarDanio(Madrastra madrastra);

    public abstract void realizarContraHechizo(Madrastra madrastra);
}
