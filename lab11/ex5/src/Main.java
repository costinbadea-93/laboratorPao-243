import model.Persoana;
import repository.MainRepository;

import java.sql.SQLException;

public class Main {
    public static void main(String[] args) throws SQLException {
        MainRepository mainRepository = new MainRepository();

        try {
            Class.forName("com.mysql.jdbc.Driver");
            Persoana p = new Persoana("Nume 1", "Prenume 1", 23);

            System.out.println("Persoane din baza: ");
            System.out.println(mainRepository.getPeople());

            mainRepository.addPerson(p);

            System.out.println("Persoane din baza: ");
            System.out.println(mainRepository.getPeople());

            mainRepository.deletePerson(1);

            System.out.println("Persoane din baza: ");
            System.out.println(mainRepository.getPeople());

        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
