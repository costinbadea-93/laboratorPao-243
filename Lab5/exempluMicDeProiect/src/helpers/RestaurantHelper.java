package helpers;

import contracts.RestaurantHelperContract;
import model.Angajat;
import model.Comanda;
import model.Meniu;
import model.Restaurant;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class RestaurantHelper extends RestaurantHelperContract {

    @Override
    public Restaurant construiesteRestaurantCuDateInitiale() {
        //MENIURI
        List<String> continutMeniu1 = Arrays.asList("Supa de pui", "Piure de cartofi cu pulpa de porc", "Salata de muraturi");
        List<String> continutMeniu2 = Arrays.asList("Ciorba de perisoare", "Escalop de vita", "Salata de varza");
        double pretMeniu1 = 18.00;
        double pretMeniu2 = 20.00;

        Meniu meniu1 = new Meniu(continutMeniu1,pretMeniu1);
        Meniu meniu2 = new Meniu(continutMeniu1,pretMeniu2);

        List<Meniu> meniuri = new ArrayList<>();
        meniuri.add(meniu1);
        meniuri.add(meniu2);

        //COMENZI
        Comanda comanda = new Comanda(1,38.00, Arrays.asList(meniu1,meniu2)) ;
        List<Comanda> comenzi = new ArrayList<>();
        comenzi.add(comanda);

        //ANGAJATI
        Angajat angajat1 = new Angajat("Popescu","Marin");
        Angajat angajat2 = new Angajat("Ionescu","George");
        angajat1.adaugaComanda(comanda);
        List<Angajat> angajati = new ArrayList<>();
        angajati.add(angajat1);
        angajati.add(angajat2);


        return new Restaurant(
                "Restaurant1",
                "Bucuresti, sector 2, nr. 45",
                angajati,
                meniuri,
                comenzi);
    }
}
