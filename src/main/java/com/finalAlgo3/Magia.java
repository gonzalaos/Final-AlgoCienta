package com.finalAlgo3;

public class Magia extends Hechizo {
    public Magia() {
        this.puntosDeEnergia = 20;
        this.puntosDeMagia = 30;
    }

    public void realizarDanio(Madrastra madrastra) {
        madrastra.recibirDanio(this.puntosDeEnergia, this.puntosDeMagia);
    }

    @Override
    public void realizarContraHechizo(Madrastra madrastra) {
        madrastra.realizarHechizo();
        return;
    }
}
