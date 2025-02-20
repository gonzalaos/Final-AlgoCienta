package com.finalAlgo3;

public class Sabiduria extends Hechizo {
    public Sabiduria() {
        this.puntosDeEnergia = 50;
    }

    public void realizarDanio(Madrastra madrastra) {
        madrastra.recibirDanio(this.puntosDeEnergia, madrastra.getPuntosDeMagia());
    }

    @Override
    public void realizarContraHechizo(Madrastra madrastra) {
        madrastra.realizarHechizo();
    }

}
