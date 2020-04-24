package model;

public class Persoana {
    private int varsta;
    private String nume;

    public Persoana(int varsta, String nume) {
        this.varsta = varsta;
        this.nume = nume;
    }

    public int getVarsta() {
        return varsta;
    }

    public void setVarsta(int varsta) {
        this.varsta = varsta;
    }

    public String getNume() {
        return nume;
    }

    public void setNume(String nume) {
        this.nume = nume;
    }

    @Override
    public String toString() {
        return "Persoana{" +
                "varsta=" + varsta +
                ", nume='" + nume + '\'' +
                '}';
    }
}
