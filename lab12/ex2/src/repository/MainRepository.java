package repository;

import com.sun.org.apache.regexp.internal.RE;
import model.Persoana;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class MainRepository {

    private List<Persoana> persoane = new ArrayList<>();

    public MainRepository(){
        persoane.add(new Persoana("NumePersoana1","PrenumePersoana1"));
        persoane.add(new Persoana("NumePersoana2","PrenumePersoana2"));
        persoane.add(new Persoana("NumePersoana3","PrenumePersoana3"));
    }

    public List<Persoana> getPersoane() {
        return persoane;
    }

    public boolean addPersoana(Persoana p) {
        persoane.add(p);
        return true;
    }

    public boolean deletePersona(String nume) {
        persoane = persoane.stream()
                .filter(persoana -> !persoana.getNume().equals(nume))
                .collect(Collectors.toList());

        return true;
    }
}
