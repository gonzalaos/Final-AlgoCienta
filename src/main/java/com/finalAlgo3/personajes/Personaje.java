package com.finalAlgo3.personajes;

public abstract class Personaje {
    protected int energia;
    protected int poderMagico;
    
    public Personaje() {
        this.energia = 100;
    }

    public abstract void realizarHechizo(Personaje personaje);

    public void recibirDanio(int energia, int poderMagico) {
        this.energia -= energia;
        this.poderMagico -= poderMagico;
    }   

    public int getPoderMagico() {
        return poderMagico;
    }

    public int getEnergia() { return energia; }
}
