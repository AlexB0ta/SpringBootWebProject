package com.example.proiectbd.model;

public class PiesaDeviz {
    private int id_d;
    private int id_p;
    private int cantitate;
    private float pret_r;

    public PiesaDeviz(){

    }

    public PiesaDeviz(int id_d, int id_p, int caantiate, float pret_r) {
        this.id_d = id_d;
        this.id_p = id_p;
        this.cantitate = caantiate;
        this.pret_r = pret_r;
    }

    public int getId_d() {
        return id_d;
    }

    public void setId_d(int id_d) {
        this.id_d = id_d;
    }

    public int getId_p() {
        return id_p;
    }

    public void setId_p(int id_p) {
        this.id_p = id_p;
    }

    public int getCantiate() {
        return cantitate;
    }

    public void setCantiate(int cantiate) {
        this.cantitate = cantiate;
    }

    public float getPret_r() {
        return pret_r;
    }

    public void setPret_r(float pret_r) {
        this.pret_r = pret_r;
    }

    @Override
    public String toString() {
        return "PiesaDeviz{" +
                "id_d=" + id_d +
                ", id_p=" + id_p +
                ", caantiate=" + cantitate +
                ", pret_r=" + pret_r +
                '}';
    }
}
