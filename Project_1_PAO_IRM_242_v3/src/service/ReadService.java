package service;

import model.*;

import java.io.*;
import java.nio.file.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.time.LocalDate;

public class ReadService {

    private static ReadService INSTANCE;

    private ReadService () {}

    public static ReadService getInstance() {
        if (INSTANCE == null) {
            INSTANCE = new ReadService();
        }
        return INSTANCE;
    }


    private static final String DIRECTORY_PATH = "files/info";

    public void readSections (SectionService sectionService) {
        String FILE_PATH = DIRECTORY_PATH + "/sections.csv";
        try  {
            BufferedReader reader = Files.newBufferedReader(Paths.get(FILE_PATH));
            String line = "";
            line = reader.readLine();
            while ((line = reader.readLine()) != null) {
                String[] atr = line.split(",");
                String name = atr[0];
                Section section = new Section(name);
                sectionService.addSection(section);
                /*
                try {
                    Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbc_pao_irm", "root", "root");
                    Statement statement = connection.createStatement();
                    int xdddd = statement.executeUpdate("INSERT INTO `jdbc_pao_irm`.`sections` (`name`) VALUES ('" + atr[0] + "');");
                    statement.close();
                    connection.close();
                }
                catch (Exception e){
                    e.printStackTrace();
                }

                 */
            }
        } catch (IOException e) {
            System.out.println(e.getClass() + " " + e.getMessage());
        }
    }

    public void readAuthors (AuthorService authorService) {
        String FILE_PATH = DIRECTORY_PATH + "/authors.csv";
        try  {
            BufferedReader reader = Files.newBufferedReader(Paths.get(FILE_PATH));
            String line = "";
            line = reader.readLine();
            while ((line = reader.readLine()) != null) {
                String[] atr = line.split(",");
                String firstName = atr[0];
                String lastName = atr[1];
                LocalDate birthDate = LocalDate.parse(atr[2]);
                Author author = new Author(firstName,lastName, birthDate);
                authorService.addAuthor(author);
                /*
                try {
                    Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbc_pao_irm", "root", "root");
                    Statement statement = connection.createStatement();
                    int xdddd = statement.executeUpdate("INSERT INTO `jdbc_pao_irm`.`authors` (`firstname`, `lastname`, `birthdate`) VALUES ('" + atr[0] + "', '" + atr[1] + "', '" + atr[2] + "');");
                    statement.close();
                    connection.close();
                }
                catch (Exception e){
                    e.printStackTrace();
                }

                 */
            }
        } catch (IOException e) {
            System.out.println(e.getClass() + " " + e.getMessage());
        }
    }

    public void readReaders (ReaderService readerService) {
        String FILE_PATH = DIRECTORY_PATH + "/readers.csv";
        try  {
            BufferedReader reader = Files.newBufferedReader(Paths.get(FILE_PATH));
            String line = "";
            line = reader.readLine();
            while ((line = reader.readLine()) != null) {
                String[] atr = line.split(",");
                String firstName = atr[0];
                String lastName = atr[1];
                LocalDate birthDate = LocalDate.parse(atr[2]);
                LocalDate startDate = LocalDate.parse(atr[3]);
                model.Reader readerObject = new model.Reader(firstName,lastName, birthDate, startDate);
                readerService.addReader(readerObject);
                /*
                try {
                    Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbc_pao_irm", "root", "root");
                    Statement statement = connection.createStatement();
                    int xdddd = statement.executeUpdate("INSERT INTO `jdbc_pao_irm`.`readers` (`firstname`, `lastname`, `birthdate`, `startdate`) VALUES ('" + firstName + "', '" + lastName +  "', '" + atr[2] + "', '" + atr[3] + "');");
                    statement.close();
                    connection.close();
                }
                catch (Exception e){
                    e.printStackTrace();
                }

                 */
            }
        } catch (IOException e) {
            System.out.println(e.getClass() + " " + e.getMessage());
        }
    }

    public void readBooks (BookService bookService) {
        String FILE_PATH = DIRECTORY_PATH + "/books.csv";
        try  {
            BufferedReader reader = Files.newBufferedReader(Paths.get(FILE_PATH));
            String line = "";
            line = reader.readLine();
            while ((line = reader.readLine()) != null) {
                String[] atr = line.split(",");
                String title = atr[0];
                String authorFirstName = atr[1];
                String authorLastName = atr[2];
                LocalDate authorBirthDate = LocalDate.parse(atr[3]);
                String section = atr[4];
                LocalDate publishDate = LocalDate.parse(atr[5]);
                Section sectionAsSection = new Section(section);
                Author author = new Author(authorFirstName, authorLastName, authorBirthDate);
                Book book = new Book(title, sectionAsSection, author, publishDate);
                bookService.addBook(book);
                /*
                try {
                    Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbc_pao_irm", "root", "root");
                    Statement statement = connection.createStatement();
                    int xdddd = statement.executeUpdate("INSERT INTO `jdbc_pao_irm`.`books` (`title`, `authorfirstname`, `authorlastname`, `authorbirthdate`, `section`, `publishdate`) VALUES ('" + atr[0] + "', '" + atr[1] + "', '" + atr[2] + "', '" + atr[3] + "', '" + atr[4] + "', '" + atr[5] + "');");
                    statement.close();
                    connection.close();
                }
                catch (Exception e){
                    e.printStackTrace();
                }

                 */
            }
        } catch (IOException e) {
            System.out.println(e.getClass() + " " + e.getMessage());
        }
    }

}
