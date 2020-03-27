package model;

import java.util.ArrayList;
import java.util.List;

public class Comanda {
    private int numarComanda;
    private double pretComanda;
    private List<Meniu> meniuriComanda = new ArrayList<>();

    public Comanda(int numarComanda, double pretComanda) {
        this.numarComanda = numarComanda;
        this.pretComanda = pretComanda;
    }

    public Comanda(int numarComanda, double pretComanda, List<Meniu> meniuriComanda) {
        this.numarComanda = numarComanda;
        this.pretComanda = pretComanda;
        this.meniuriComanda = meniuriComanda;
    }

    public int getNumarComanda() {
        return numarComanda;
    }

    public void setNumarComanda(int numarComanda) {
        this.numarComanda = numarComanda;
    }

    public double getPretComanda() {
        return pretComanda;
    }

    public void setPretComanda(double pretComanda) {
        this.pretComanda = pretComanda;
    }

    public List<Meniu> getMeniuriComanda() {
        return meniuriComanda;
    }

    public void setMeniuriComanda(List<Meniu> meniuriComanda) {
        this.meniuriComanda = meniuriComanda;
    }

    @Override
    public String toString() {
        return "Comanda{" +
                "numarComanda=" + numarComanda +
                ", pretComanda=" + pretComanda +
                ", meniuriComanda=" + meniuriComanda +
                '}';
    }
}
