package service;

import model.*;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class BookService {

    private List<Book> bookList;
    private static BookService INSTANCE = null;

    private BookService(){

        bookList = new ArrayList<>();
    }

    public static BookService getInstance() {
        if (INSTANCE == null) {
            INSTANCE = new BookService();
        }
        return INSTANCE;
    }

    public void addBook(Book c){

        bookList.add(new Book(c));

        try {
            Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbc_pao_irm", "root", "root");
            Statement statement = connection.createStatement();
            int xdddd = statement.executeUpdate("INSERT INTO `jdbc_pao_irm`.`books` (`title`, `authorfirstname`, `authorlastname`, `authorbirthdate`, `section`, `publishdate`) VALUES ('" + c.getTitle() + "', '" + c.getAuthor().getFirstName() + "', '" + c.getAuthor().getLastName() + "', '" + c.getAuthor().getBirthDate().toString() + "', '" + c.getSection().getName() + "', '" +c.getPublishDate() + "');");
            statement.close();
            connection.close();
        }
        catch (Exception e){
            e.printStackTrace();
        }
        sortBook();

    }

    private void sortBook(){
        Collections.sort(bookList);
    }

    public void showBooks(){
        for (Book c : bookList){
            System.out.println(c);
        }


        try {
            Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbc_pao_irm", "root", "root");
            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery("select * from books");
            while (resultSet.next()) {
                System.out.println(resultSet.getString("title"));
            }
            resultSet.close();
            statement.close();
            connection.close();
        }
        catch (Exception e){
            e.printStackTrace();
        }
    }

    public void updateBook(Book b)
    {

        try {
            Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbc_pao_irm", "root", "root");
            Statement statement = connection.createStatement();
            int xdddd = statement.executeUpdate("update books set title = '" + b.getTitle() + "sch" +   "' where title = '" + b.getTitle() +  "'");
            statement.close();
            connection.close();
        } catch (Exception e) {
            e.printStackTrace();
        }

    }


    public void deleteBook(Book b)

    {
        try {
            Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbc_pao_irm", "root", "root");
            Statement statement = connection.createStatement();
            int xdddd = statement.executeUpdate("delete from books where title = '" + b.getTitle() +  "'");
            statement.close();
            connection.close();
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    public List<Book> getBooks(){
        return bookList;
    }

}
