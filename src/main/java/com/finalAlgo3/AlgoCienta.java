package com.finalAlgo3;

import java.util.*;

public class AlgoCienta extends Personaje {
    private List<Hechizo> hechizos;

    public AlgoCienta(List<Hechizo> hechizos) {
        super();    
        this.puntosDeMagia = 0;
        this.hechizos = hechizos;
    }

    public void realizarHechizo(Madrastra madrastra) {
        for(Hechizo hechizo : this.hechizos) {
            hechizo.realizarDanio(madrastra);
            hechizo.realizarContraHechizo(madrastra);
            // madrastra.realizarHechizo(hechizo);
        }
    }

    @Override
    public void recibirDanio(int puntosDeEnergia, int puntosDeMagia) {
        return;
    }
}
