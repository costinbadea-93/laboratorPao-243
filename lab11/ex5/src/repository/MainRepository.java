package repository;

import model.Persoana;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class MainRepository {
    private static final String DATABASE_URL = "jdbc:mysql://localhost:3306/pao";
    private static final String DATABASE_USER = "root";
    private static final String DATABASE_PASSWORD= "root";

    private static final String GET_ALL_PEOPLE = "SELECT * FROM persoana";
    private static final String CREATE_NEW_PERSON = "INSERT INTO persoana(idPersoana,numePersoana,prenumePersoana,varsta)" +
            " values (NULL,?,?,?)";
    private static final String DELETE_PERSON = "DELETE FROM persoana WHERE idPersoana = ?";

    public static Connection getDbConnection() throws SQLException{
        return DriverManager.getConnection(DATABASE_URL,DATABASE_USER,DATABASE_PASSWORD);
    }

    public List<Persoana> getPeople() throws SQLException{
        List<Persoana> returnedList = new ArrayList<>();
        PreparedStatement preparedStatement = getDbConnection().prepareStatement(GET_ALL_PEOPLE);
        ResultSet rs = preparedStatement.executeQuery();
        while (rs.next()){
            Persoana p = new Persoana(rs.getInt(1),rs.getString(2),rs.getString(3),rs.getInt(4));
            returnedList.add(p);
        }
        return returnedList;
    }

    public boolean addPerson(Persoana p) throws SQLException{
        PreparedStatement preparedStatement = getDbConnection().prepareStatement(CREATE_NEW_PERSON);
        preparedStatement.setString(1,p.getNumePersoana());
        preparedStatement.setString(2,p.getPrenumePersoana());
        preparedStatement.setInt(3,p.getVarsta());

        return preparedStatement.executeUpdate() > 0;
    }

    public boolean deletePerson(int idPersoana) throws SQLException{
        PreparedStatement preparedStatement = getDbConnection().prepareStatement(DELETE_PERSON);
        preparedStatement.setInt(1,idPersoana);
        return preparedStatement.executeUpdate() > 0;
    }

}
