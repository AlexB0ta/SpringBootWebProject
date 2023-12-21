package com.example.proiectbd.model;

public class Sel5b {
    private String descriere;
    private String fabricant;

    public Sel5b(){

    }

    public Sel5b(String descriere, String fabricant) {
        this.descriere = descriere;
        this.fabricant = fabricant;
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

    @Override
    public String toString() {
        return "Sel5b{" +
                "descriere='" + descriere + '\'' +
                ", fabricant='" + fabricant + '\'' +
                '}';
    }
}
