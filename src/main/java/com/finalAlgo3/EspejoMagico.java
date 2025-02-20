package com.finalAlgo3;

public class EspejoMagico {
    private int puntosDeEnergia;

    public EspejoMagico(Madrastra madrastra) {
        this.puntosDeEnergia = madrastra.getPuntosDeMagia();
    }

    public void realizarDanio(AlgoCienta algoCienta) {
        algoCienta.recibirDanio(this.puntosDeEnergia, 0);
    }
}
