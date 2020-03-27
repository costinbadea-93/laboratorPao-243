package contracts;

import model.Angajat;
import model.Comanda;
import model.Meniu;

public interface RestaurantContract {
     void adaugaAngajat(Angajat angajat);
     void stergeAngajat(int index);
     void adaugaComanda(Comanda comanda);
     void adaugaMeniu(Meniu meniu);
}
