package com.finalAlgo3;

public class Valor extends Hechizo {
    public Valor() {
        this.puntosDeEnergia = 10;
        this.puntosDeMagia = 10;
    }

    public void realizarDanio(Madrastra madrastra) {
        madrastra.recibirDanio(this.puntosDeEnergia, this.puntosDeMagia);
    }

    @Override
    public void realizarContraHechizo(Madrastra madrastra) {
        return;
    }
}
