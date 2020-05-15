package model;

public class Persoana {

    private int idPersoana;
    private String numePersoana;
    private String prenumePersoana;
    private int varsta;

    public Persoana(int idPersoana, String numePersoana, String prenumePersoana, int varsta) {
        this.idPersoana = idPersoana;
        this.numePersoana = numePersoana;
        this.prenumePersoana = prenumePersoana;
        this.varsta = varsta;
    }

    public Persoana(String numePersoana, String prenumePersoana, int varsta) {
        this.numePersoana = numePersoana;
        this.prenumePersoana = prenumePersoana;
        this.varsta = varsta;
    }

    public int getIdPersoana() {
        return idPersoana;
    }

    public void setIdPersoana(int idPersoana) {
        this.idPersoana = idPersoana;
    }

    public String getNumePersoana() {
        return numePersoana;
    }

    public void setNumePersoana(String numePersoana) {
        this.numePersoana = numePersoana;
    }

    public String getPrenumePersoana() {
        return prenumePersoana;
    }

    public void setPrenumePersoana(String prenumePersoana) {
        this.prenumePersoana = prenumePersoana;
    }

    public int getVarsta() {
        return varsta;
    }

    public void setVarsta(int varsta) {
        this.varsta = varsta;
    }

    @Override
    public String toString() {
        return "Persoana{" +
                "idPersoana=" + idPersoana +
                ", numePersoana='" + numePersoana + '\'' +
                ", prenumePersoana='" + prenumePersoana + '\'' +
                ", varsta=" + varsta +
                '}';
    }
}
