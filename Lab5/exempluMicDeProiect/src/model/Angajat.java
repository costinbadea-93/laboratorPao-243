package model;

import java.util.ArrayList;
import java.util.List;

public class Angajat {
    private String numeAngajat;
    private String prenumeAngajat;
    private List<Comanda> comenziDeLivrat = new ArrayList<>();

    public Angajat(String numeAngajat, String prenumeAngajat) {
        this.numeAngajat = numeAngajat;
        this.prenumeAngajat = prenumeAngajat;
    }

    public void adaugaComanda(Comanda comanda) {
        comenziDeLivrat.add(comanda);
        System.out.println(">>>>>>>>La angajatul " + this.numeAngajat + " " + this.prenumeAngajat + "s-a adaugat comanda <<<<<<<<");
        System.out.println(this.comenziDeLivrat);

    }

    public Angajat(String numeAngajat, String prenumeAngajat, List<Comanda> comenziDeLivrat) {
        this.numeAngajat = numeAngajat;
        this.prenumeAngajat = prenumeAngajat;
        this.comenziDeLivrat = comenziDeLivrat;
    }

    public String getNumeAngajat() {
        return numeAngajat;
    }

    public void setNumeAngajat(String numeAngajat) {
        this.numeAngajat = numeAngajat;
    }

    public String getPrenumeAngajat() {
        return prenumeAngajat;
    }

    public void setPrenumeAngajat(String prenumeAngajat) {
        this.prenumeAngajat = prenumeAngajat;
    }

    public List<Comanda> getComenziDeLivrat() {
        return comenziDeLivrat;
    }

    public void setComenziDeLivrat(List<Comanda> comenziDeLivrat) {
        this.comenziDeLivrat = comenziDeLivrat;
    }

    @Override
    public String toString() {
        return "Angajat{" +
                "numeAngajat='" + numeAngajat + '\'' +
                ", prenumeAngajat='" + prenumeAngajat + '\'' +
                ", comenziDeLivrat=" + comenziDeLivrat +
                '}';
    }

}
