package service;

import model.*;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class AuthorService {

    private List<Author> authorList;
    private static AuthorService INSTANCE = null;

    private AuthorService() {

        authorList = new ArrayList<>();
    }

    public static AuthorService getInstance() {
        if (INSTANCE == null) {
            INSTANCE = new AuthorService();
        }
        return INSTANCE;
    }

    public void addAuthor(Author a) {

        authorList.add(new Author(a));


        try {
            Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbc_pao_irm", "root", "root");
            Statement statement = connection.createStatement();
            int xdddd = statement.executeUpdate("INSERT INTO `jdbc_pao_irm`.`authors` (`firstname`, `lastname`, `birthdate`) VALUES ('" + a.getFirstName() + "', '" + a.getLastName() + "', '" + a.getBirthDate() + "');");
            statement.close();
            connection.close();
        } catch (Exception e) {
            e.printStackTrace();
        }


        sortAuthor();

    }

    private void sortAuthor() {
        Collections.sort(authorList);
    }

    public void showAuthors() {
        for (Author a : authorList) {
            System.out.println(a);
        }


        try {
            Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbc_pao_irm", "root", "root");
            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery("select * from authors");
            while (resultSet.next()) {
                System.out.println(resultSet.getString("firstname") + " | " + resultSet.getString("lastname"));
            }
            resultSet.close();
            statement.close();
            connection.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void updateAuthor(Author a)

    {
        try {
            Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbc_pao_irm", "root", "root");
            Statement statement = connection.createStatement();
            int xdddd = statement.executeUpdate("update authors set firstname = '" + a.getFirstName() + "sch" +   "', lastname = '" + a.getLastName() + "sch" + "' where birthdate = '" + a.getBirthDate() +  "'");
            statement.close();
            connection.close();
        } catch (Exception e) {
            e.printStackTrace();
        }

    }


    public void deleteAuthor(Author a)

    {
        try {
            Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbc_pao_irm", "root", "root");
            Statement statement = connection.createStatement();
            int xdddd = statement.executeUpdate("delete from authors where birthdate = '" + a.getBirthDate() +  "'");
            statement.close();
            connection.close();
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    public List<Author> getAuthors(){
        return authorList;
    }

}
