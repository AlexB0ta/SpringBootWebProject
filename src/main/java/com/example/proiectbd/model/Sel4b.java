package com.example.proiectbd.model;

public class Sel4b {
    private int id_piesa1;
    private int id_piesa2;

    public Sel4b(){

    }

    public Sel4b(int id_piesa1, int id_piesa2) {
        this.id_piesa1 = id_piesa1;
        this.id_piesa2 = id_piesa2;
    }

    public int getId_piesa1() {
        return id_piesa1;
    }

    public void setId_piesa1(int id_piesa1) {
        this.id_piesa1 = id_piesa1;
    }

    public int getId_piesa2() {
        return id_piesa2;
    }

    public void setId_piesa2(int id_piesa2) {
        this.id_piesa2 = id_piesa2;
    }

    @Override
    public String toString() {
        return "Sel4b{" +
                "id_piesa1=" + id_piesa1 +
                ", id_piesa2=" + id_piesa2 +
                '}';
    }
}
