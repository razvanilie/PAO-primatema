package service;

import model.*;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;


public class ReaderService {

    private List<Reader> readerList;
    private static ReaderService INSTANCE = null;

    private ReaderService(){
        readerList = new ArrayList<>();
    }

    public static ReaderService getInstance() {
        if (INSTANCE == null) {
            INSTANCE = new ReaderService();
        }
        return INSTANCE;
    }

    public void addReader(Reader c){

        readerList.add(new Reader(c));


        try {
            Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbc_pao_irm", "root", "root");
            Statement statement = connection.createStatement();
            int xdddd = statement.executeUpdate("INSERT INTO `jdbc_pao_irm`.`readers` (`firstname`, `lastname`, `birthdate`, `startdate`) VALUES ('" + c.getFirstName() + "', '" + c.getLastName() +  "', '" + c.getBirthDate() + "', '" + c.getStartDate() + "');");
            statement.close();
            connection.close();
        }
        catch (Exception e){
            e.printStackTrace();
        }


        sortReaders();

    }

    private void sortReaders(){
        Collections.sort(readerList);
    }

    public void showReaders(){
        for (Reader c : readerList){
            System.out.println(c.toString());



        }



        try {
            Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbc_pao_irm", "root", "root");
            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery("select * from readers");
            while (resultSet.next()) {
                System.out.println(resultSet.getString("firstname"));
            }
            resultSet.close();
            statement.close();
            connection.close();
        }
        catch (Exception e){
            e.printStackTrace();
        }
    }

    public void updateReader(Reader r)
    {

        try {
            Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbc_pao_irm", "root", "root");
            Statement statement = connection.createStatement();
            int xdddd = statement.executeUpdate("update readers set firstname = '" + r.getFirstName() + "sch" +   "', lastname = '" + r.getLastName() + "sch" + "' where birthdate = '" + r.getBirthDate() +  "'");
            statement.close();
            connection.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }


    public void deleteReader(Reader r)

    {
        try {
            Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbc_pao_irm", "root", "root");
            Statement statement = connection.createStatement();
            int xdddd = statement.executeUpdate("delete from readers where birthdate = '" + r.getBirthDate() +  "'");
            statement.close();
            connection.close();
        } catch (Exception e) {
            e.printStackTrace();
        }

    }


    public List<Reader> getReaders(){
        return readerList;
    }
}
