package com.company;



public class Vierkant {
    private int zijde;
    public Vierkant (int zijde){
        this.zijde = zijde;
    }


    public int getZijde() {
        return this.zijde;
    }

    public int getOmtrek() {
        return this.zijde * 4;
    }

    public int getOppervlakte() {
        return this.zijde*this.zijde;
    }
}
