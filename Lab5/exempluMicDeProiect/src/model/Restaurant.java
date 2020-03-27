package model;

import contracts.RestaurantContract;

import java.util.ArrayList;
import java.util.List;

public class Restaurant implements RestaurantContract {

    private String numeRestaurant;
    private String locatieRestaurant;

    private List<Angajat> angajati = new ArrayList<>();
    private List<Meniu> meniuri = new ArrayList<>();
    private List<Comanda> comenzi = new ArrayList<>();

    public Restaurant(String numeRestaurant, String locatieRestaurant) {
        this.numeRestaurant = numeRestaurant;
        this.locatieRestaurant = locatieRestaurant;
    }

    public Restaurant(String numeRestaurant, String locatieRestaurant, List<Angajat> angajati, List<Meniu> meniuri, List<Comanda> comenzi) {
        this.numeRestaurant = numeRestaurant;
        this.locatieRestaurant = locatieRestaurant;
        this.angajati = angajati;
        this.meniuri = meniuri;
        this.comenzi = comenzi;
    }

    public String getNumeRestaurant() {
        return numeRestaurant;
    }

    public void setNumeRestaurant(String numeRestaurant) {
        this.numeRestaurant = numeRestaurant;
    }

    public String getLocatieRestaurant() {
        return locatieRestaurant;
    }

    public void setLocatieRestaurant(String locatieRestaurant) {
        this.locatieRestaurant = locatieRestaurant;
    }

    public List<Angajat> getAngajati() {
        return angajati;
    }

    public void setAngajati(List<Angajat> angajati) {
        this.angajati = angajati;
    }

    public List<Meniu> getMeniuri() {
        return meniuri;
    }

    public void setMeniuri(List<Meniu> meniuri) {
        this.meniuri = meniuri;
    }

    public List<Comanda> getComenzi() {
        return comenzi;
    }

    public void setComenzi(List<Comanda> comenzi) {
        this.comenzi = comenzi;
    }

    @Override
    public void adaugaAngajat(Angajat angajat) {
        this.angajati.add(angajat);
        System.out.println(">>>>>>>>>>>S-a adaugat la restaurant angajatul: <<<<<<<<<<<<<<");
        System.out.println(angajat);
    }

    @Override
    public void stergeAngajat(int index) {
        this.angajati.remove(index);
        System.out.println(">>>>>>>>>>>S-a sters din sistem angajatul cu indexul : "+ index +" <<<<<<<<<<<<<<");
    }

    @Override
    public void adaugaComanda(Comanda comanda) {
        this.comenzi.add(comanda);
        System.out.println(">>>>>>>>>>>S-a adaugat la restaurant comanda: <<<<<<<<<<<<<<");
        System.out.println(comanda);
    }

    @Override
    public void adaugaMeniu(Meniu meniu) {
        this.meniuri.add(meniu);
        System.out.println(">>>>>>>>>>>S-a adaugat la restaurant meniul: <<<<<<<<<<<<<<");
        System.out.println(meniu);
    }
}
