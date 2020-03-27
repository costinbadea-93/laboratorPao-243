import helpers.RestaurantHelper;
import model.Angajat;
import model.Restaurant;

import java.util.Scanner;

/**
 * Scenariu:
 * Un restaurant detine Angajati si Meniuri. De asemena in cadrul restauranturlui
 * se exista comenzi, ele fiind livrate de angajati, astfel, fiecare angajat va avea
 * una sau mai multe comenzi.
 *
 * In restaurant am bagat niste date de instantiere, acest lucru se face prin intermediul
 * clasei RestaurantHelper.
 *
 * In cadrul restaurantului am implementat ca exemplu:
 *  "1.Adauga angajat";
 *  "2.Sterge angajat";
 *  "3.Listeaza meniuri"
 *  "4.Listeaza angajati
 *  "5.Listeaza comenzi"
 *
 *  PS: ACESTA ESTE UN EXEMPLU CARE SA AJUTE PUTIN,
 *      Am rugamintea sa implementati mai multe tipuri de interogari in proiecte in care sa folositi
 *      sortari, cat si interogari care sa arate interactiunea intre clase:
 *        ex: afisare angajati sortat;
 *            afisare pret pentru toate comenzile;
 *            afisare comenzi in functie de un anumit angajat etc.
 *
*       Va rog sa puneti cat mai mult amprenta personala, inca o data acesta este doar un mic exemplu
 *      care sa va ghideze.
 *
 *     Folositi cat mai mute elemente folosite la laboraror: interfete, calse abstracte, mostenire, polimorfism
 *     sortari, citire din consola, agredare si compozitie etc.
 *
 *      NOTA!!!: Eu am folosit aici liste in implementare. Am rugamintea sa folositi si Arrays si sa va
 *      creati funcii de adaugat si sters dintr-un array. Raportul arrays vs liste sa fie undeva 50%-50%
 */

public class Main {
    public static void main(String[] args) {
        Restaurant restaurant = new RestaurantHelper().construiesteRestaurantCuDateInitiale();
        Scanner scanner = new Scanner(System.in);
        System.out.println("\n");
        System.out.println("Restaurantul "+ restaurant.getNumeRestaurant() + " va sta la dispozitie!");
        System.out.println("\n");
        System.out.println("Selectati una din optiunile de mai jos pentru a afla mai multe informatii.");

        System.out.println("1.Adauga angajat");
        System.out.println("2.Sterge angajat");
        System.out.println("3.Listeaza meniuri");
        System.out.println("4.Listeaza angajati");
        System.out.println("5.Listeaza comenzi");
        System.out.println("6.exit");

        while (true) {
            String optiune = scanner.next();
            switch (optiune) {
                case "1":
                    System.out.println("Introduceti numele angajatului: ");
                    String numeAngajat = scanner.next();
                    System.out.println("Introduceti prenumele angajatului: ");
                    String prenumeAngajat = scanner.next();
                    Angajat angajat = new Angajat(numeAngajat,prenumeAngajat);
                    restaurant.adaugaAngajat(angajat);
                    break;
                case "2":
                    System.out.println("Introduceti indexul angajatului ce va fi sters: ");
                    String index = scanner.next();
                    restaurant.stergeAngajat(Integer.valueOf(index));
                    break;
                case "3":
                    System.out.println("Meniurile din restaurant sunt: ");
                    System.out.println("\n");
                    System.out.println(restaurant.getMeniuri());
                    break;
                case "4":
                    System.out.println("Angajatii din restaurant sunt: ");
                    System.out.println("\n");
                    System.out.println(restaurant.getAngajati());
                    break;
                case "5":
                    System.out.println("Comenzile din restaurant sunt: ");
                    System.out.println("\n");
                    System.out.println(restaurant.getComenzi());
                    break;
                case "exit" :
                   System.exit(0);
                   break;
                default:
                    System.out.println("\n");
                    System.out.println("Ai ales o optiune incorecta, selectati una din cele de mai sus.");
            }
        }


    }
}
