package service;

import model.*;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SectionService {

    private List<Section> sectionList;
    private static SectionService INSTANCE = null;

    private SectionService(){

        sectionList = new ArrayList<>();
    }

    public static SectionService getInstance() {
        if (INSTANCE == null) {
            INSTANCE = new SectionService();
        }
        return INSTANCE;
    }

    public void addSection(Section s){

        sectionList.add(new Section(s));


        try {
            Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbc_pao_irm", "root", "root");
            Statement statement = connection.createStatement();
            int xdddd = statement.executeUpdate("INSERT INTO `jdbc_pao_irm`.`sections` (`name`) VALUES ('" + s.getName() + "');");
            statement.close();
            connection.close();
        }
        catch (Exception e){
            e.printStackTrace();
        }

        sortSections();

    }

    private void sortSections(){
        Collections.sort(sectionList);
    }

    public void showSections(){
        for (Section s : sectionList){
            System.out.println(s);
        }


        try {
            Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbc_pao_irm", "root", "root");
            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery("select * from sections");
            while (resultSet.next()) {
                System.out.println(resultSet.getString("name"));
            }
            resultSet.close();
            statement.close();
            connection.close();
        }
        catch (Exception e){
            e.printStackTrace();
        }
    }


    public void updateSection(Section s)
    {


        try {
            Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbc_pao_irm", "root", "root");
            Statement statement = connection.createStatement();
            int xdddd = statement.executeUpdate("update sections set name = '" + s.getName() + "sch" +   "' where name = '" + s.getName() +  "'");
            statement.close();
            connection.close();
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    public void deleteSection(Section s)

    {
        try {
            Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbc_pao_irm", "root", "root");
            Statement statement = connection.createStatement();
            int xdddd = statement.executeUpdate("delete from sections where name = '" + s.getName() +  "'");
            statement.close();
            connection.close();
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    public List<Section> getSections(){
        return sectionList;
    }
}
