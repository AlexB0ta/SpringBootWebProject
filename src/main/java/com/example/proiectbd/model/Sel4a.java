package com.example.proiectbd.model;

public class Sel4a {
    private int id_d;
    private String descriere;
    private String fabricant;
    private double pret_c;
    private double pret_r;

    public Sel4a(){

    }

    public Sel4a(int id_d, String descriere, String fabricant, double pret_c, double pret_r) {
        this.id_d = id_d;
        this.descriere = descriere;
        this.fabricant = fabricant;
        this.pret_c = pret_c;
        this.pret_r = pret_r;
    }

    public int getId_d() {
        return id_d;
    }

    public void setId_d(int id_d) {
        this.id_d = id_d;
    }

    public String getDescriere() {
        return descriere;
    }

    public void setDescriere(String descriere) {
        this.descriere = descriere;
    }

    public String getFabricant() {
        return fabricant;
    }

    public void setFabricant(String fabricant) {
        this.fabricant = fabricant;
    }

    public double getPret_c() {
        return pret_c;
    }

    public void setPret_c(double pret_c) {
        this.pret_c = pret_c;
    }

    public double getPret_r() {
        return pret_r;
    }

    public void setPret_r(double pret_r) {
        this.pret_r = pret_r;
    }

    @Override
    public String toString() {
        return "Sel4a{" +
                "id_d=" + id_d +
                ", descriere='" + descriere + '\'' +
                ", fabricant='" + fabricant + '\'' +
                ", pret_c=" + pret_c +
                ", pret_r=" + pret_r +
                '}';
    }
}
