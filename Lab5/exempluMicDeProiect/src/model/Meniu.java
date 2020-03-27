package model;

import java.util.ArrayList;
import java.util.List;

public class Meniu {
   private List<String> continutMeniu =  new ArrayList<>();
   private double pretMeniu;

    public Meniu(List<String> continutMeniu, double pretMeniu) {
        this.continutMeniu = continutMeniu;
        this.pretMeniu = pretMeniu;
    }

    public List<String> getContinutMeniu() {
        return continutMeniu;
    }

    public void setContinutMeniu(List<String> continutMeniu) {
        this.continutMeniu = continutMeniu;
    }

    public double getPretMeniu() {
        return pretMeniu;
    }

    public void setPretMeniu(double pretMeniu) {
        this.pretMeniu = pretMeniu;
    }

    @Override
    public String toString() {
        return "Meniu{" +
                "continutMeniu=" + continutMeniu +
                ", pretMeniu=" + pretMeniu +
                '}';
    }
}
