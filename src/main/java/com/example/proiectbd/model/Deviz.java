package com.example.proiectbd.model;

import java.time.LocalDate;

public class Deviz {
    private int id_d;
    private String data_introducere;
    private String aparat;
    private String simptome;
    private  String defect;
    private String data_constatare;
    private String data_finalizare;
    private int durata;
    private double manopera_ora;
    private double total;
    private int id_client;
    private int id_depanator;

    public Deviz(){

    }

    public int getId_d() {
        return id_d;
    }

    public void setId_d(int id_d) {
        this.id_d = id_d;
    }

    public String getData_introducere() {
        return data_introducere;
    }

    public void setData_introducere(String data_introducere) {
        this.data_introducere = data_introducere;
    }

    public String getAparat() {
        return aparat;
    }

    public void setAparat(String aparat) {
        this.aparat = aparat;
    }

    public String getSimptome() {
        return simptome;
    }

    public void setSimptome(String simptome) {
        this.simptome = simptome;
    }

    public String getDefect() {
        return defect;
    }

    public void setDefect(String defect) {
        this.defect = defect;
    }

    public String getData_constatare() {
        return data_constatare;
    }

    public void setData_constatare(String data_constatare) {
        this.data_constatare = data_constatare;
    }

    public String getData_finalizare() {
        return data_finalizare;
    }

    public void setData_finalizare(String data_finalizare) {
        this.data_finalizare = data_finalizare;
    }

    public int getDurata() {
        return durata;
    }

    public void setDurata(int durata) {
        this.durata = durata;
    }

    public double getManopera_ora() {
        return manopera_ora;
    }

    public void setManopera_ora(double manopera_ora) {
        this.manopera_ora = manopera_ora;
    }

    public double getTotal() {
        return total;
    }

    public void setTotal(double total) {
        this.total = total;
    }

    public int getId_client() {
        return id_client;
    }

    public void setId_client(int id_client) {
        this.id_client = id_client;
    }

    public int getId_depanator() {
        return id_depanator;
    }

    public void setId_depanator(int id_depanator) {
        this.id_depanator = id_depanator;
    }

    public Deviz(int id_d, String data_introducere, String aparat, String simptome, String defect, String data_constatare, String data_finalizare, int durata, double manopera_ora, double total, int id_client, int id_depanator) {
        this.id_d = id_d;
        this.data_introducere = data_introducere;
        this.aparat = aparat;
        this.simptome = simptome;
        this.defect = defect;
        this.data_constatare = data_constatare;
        this.data_finalizare = data_finalizare;
        this.durata = durata;
        this.manopera_ora = manopera_ora;
        this.total = total;
        this.id_client = id_client;
        this.id_depanator = id_depanator;
    }

    @Override
    public String toString() {
        return "Deviz{" +
                "id_d=" + id_d +
                ", data_introducere=" + data_introducere +
                ", aparat='" + aparat + '\'' +
                ", simptome='" + simptome + '\'' +
                ", defect='" + defect + '\'' +
                ", data_constatare='" + data_constatare + '\'' +
                ", data_finalizare='" + data_finalizare + '\'' +
                ", durata=" + durata +
                ", manopera_ora=" + manopera_ora +
                ", total=" + total +
                ", id_client=" + id_client +
                ", id_depanator=" + id_depanator +
                '}';
    }
}
