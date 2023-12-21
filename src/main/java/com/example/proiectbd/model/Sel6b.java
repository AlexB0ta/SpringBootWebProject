package com.example.proiectbd.model;

public class Sel6b {
    private String descriere;
    private String fabricant;
    private int cantitate_totala;

    public Sel6b(){

    }

    public Sel6b(String descriere, String fabricant, int cantitate_totala) {
        this.descriere = descriere;
        this.fabricant = fabricant;
        this.cantitate_totala = cantitate_totala;
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

    public int getCantitate_totala() {
        return cantitate_totala;
    }

    public void setCantitate_totala(int cantitate_totala) {
        this.cantitate_totala = cantitate_totala;
    }

    @Override
    public String toString() {
        return "Sel6b{" +
                "descriere='" + descriere + '\'' +
                ", fabricant='" + fabricant + '\'' +
                ", cantitate_totala=" + cantitate_totala +
                '}';
    }
}
