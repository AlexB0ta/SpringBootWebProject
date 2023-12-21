package com.example.proiectbd.model;

public class Sel6a {
    private String nume_depanator;
    private int cate_devize;

    public Sel6a(){

    }

    public Sel6a(String nume_depanator, int cate_devize) {
        this.nume_depanator = nume_depanator;
        this.cate_devize = cate_devize;
    }

    public String getNume_depanator() {
        return nume_depanator;
    }

    public void setNume_depanator(String nume_depanator) {
        this.nume_depanator = nume_depanator;
    }

    public int getCate_devize() {
        return cate_devize;
    }

    public void setCate_devize(int cate_devize) {
        this.cate_devize = cate_devize;
    }

    @Override
    public String toString() {
        return "Sel6a{" +
                "nume_depanator='" + nume_depanator + '\'' +
                ", cate_devize=" + cate_devize +
                '}';
    }
}
