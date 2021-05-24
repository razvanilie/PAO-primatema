package main;

import model.*;
import service.*;

import javax.xml.transform.Result;
import java.time.LocalDate;
import java.sql.*;

public class Main {

    public static void main(String[] args) {

        /*Delete all current records from tables

        First it will delete all entries from tables, then it will get the data from csv and will add it to the empty tables.

        To read the data, i added in each classService a query

         */

        try {
            Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbc_pao_irm", "root", "root");
            Statement statement = connection.createStatement();
            int xdddd = statement.executeUpdate("DELETE FROM READERS;");
            xdddd = statement.executeUpdate("DELETE FROM books;");
            xdddd = statement.executeUpdate("DELETE FROM sections;");
            xdddd = statement.executeUpdate("DELETE FROM authors;");
            statement.close();
            connection.close();
        }
        catch (Exception e){
            e.printStackTrace();
        }

        ///////////////////

        Person p1 = new Person("Andrei", "Mihai", LocalDate.of(1999, 10, 5));
        Person p3 = new Person("Andrei", "Mihai", LocalDate.of(1999, 10, 5));
        AuditService auditService = AuditService.getInstance();
        System.out.println(p1.toString());
        Person p2 = new Person();
        Person p4 = new Person("Mihai-George", "Mocanu", LocalDate.of(1980, 12, 10));
        Person p10 = new Person("Amir", "Majeri", LocalDate.of(2009, 1, 9));
        Person p6 = new Person("Eduardo", "Ilie", LocalDate.of(2003, 5, 17));
        Person p7 = new Person("Gabriel", "Ilie", LocalDate.of(1959, 3, 25));
        Person p8 = new Person("Ilinca-Maria", "Ilie", LocalDate.of(2000, 11, 15));
        Person p9 = new Person("Gabriel Constantin", "Richiteanu", LocalDate.of(1999, 10, 3));
        System.out.println(p2.toString());

        if (p3.equals(p1) == true) {

            System.out.println("Matrix: persoane identice");

        }
        else
            System.out.println("Persoanele sunt speciale/diferite");

        System.out.println(p2.compareTo(p1));

        Author a1 = new Author();
        Author a2 = new Author("Aurel", "Aur", LocalDate.of(1900, 1, 10));
        Author a3 = new Author("Mihai", "Eminescu", LocalDate.of(1905, 6, 25));
        Author a14 = new Author("Ion", "Creanga", LocalDate.of(2005, 4, 13));
        Author a15 = new Author("Ioan", "Slavici", LocalDate.of(1940, 1, 1));
        Author a16 = new Author("Tudor", "Arghezi", LocalDate.of(1935, 10, 3));
        Author a17 = new Author("George", "Bacovia", LocalDate.of(1922, 12, 16));
        Author a18 = new Author("Mircea", "Cartarescu", LocalDate.of(1877, 7, 15));
        Author a19 = new Author("Joanne", "Rowling", LocalDate.of(1883, 10, 15));
        Author a20 = new Author("Jordan", "Peterson", LocalDate.of(1989, 8, 22));
        System.out.println(a1.toString());
        System.out.println(a2.toString());
        System.out.println(a3.toString());

        System.out.println(a3.toString());

        System.out.println(a1.compareTo(p2));

        Reader c1 = new Reader();
        System.out.println(c1.getStartDate());

        System.out.println(c1.toString());
        Reader c2 = new Reader("Florian", "Fadrei", LocalDate.of(2000, 10, 12), LocalDate.now());
        Reader c10 = new Reader("Mihaita", "Marcu", LocalDate.of(2002, 5, 23), LocalDate.now());
        Reader c11 = new Reader("Razvan", "Sandu", LocalDate.of(2001, 3, 24), LocalDate.now());
        Reader c12 = new Reader("Carmen", "Ursu", LocalDate.of(2000, 4, 14), LocalDate.now());
        Reader c13 = new Reader("Ioana", "Ilie", LocalDate.of(1995, 5, 2), LocalDate.now());
        Reader c14 = new Reader("Daniela", "Neagu", LocalDate.of(1992, 6, 12), LocalDate.now());
        Reader c15 = new Reader("Florenza", "Sava", LocalDate.of(1992, 7, 3), LocalDate.now());
        Reader c16 = new Reader("Angel", "Apostol", LocalDate.of(1997, 8, 16), LocalDate.of(2019,3,26));
        Reader c17 = new Reader("Cosmina", "Lupu", LocalDate.of(1980, 9, 7), LocalDate.of(2020,6,6));
        Reader c18 = new Reader("Alexia", "Margarit", LocalDate.of(1994, 10, 23), LocalDate.of(2018,5,7));
        Reader c19 = new Reader("Adrian-Gabriel", "Prodan", LocalDate.of(2000, 11, 30), LocalDate.of(2016,10,14));
        Reader c20 = new Reader("Ion", "Radulescu", LocalDate.of(2001, 12, 29), LocalDate.of(2015,2,25));
        Reader c21 = new Reader("Andrei", "Tudoran", LocalDate.of(1922, 3, 14), LocalDate.of(2015,2,2));
        Reader c22 = new Reader("Florina", "Popa", LocalDate.of(1944, 3, 5), LocalDate.of(2018,4,3));
        Reader c23 = new Reader("Denis", "Adam", LocalDate.of(2003, 3, 5), LocalDate.of(2014,3,4));
        System.out.println(c2.toString());

        Reader c3 = new Reader(c2);
        System.out.println(c3.toString());

        Person p5 = new Person("Andrie", "Marius");
        System.out.println(p5.toString());

        Reader a5 = new Reader("Frate", "Eu");
        System.out.println(a5.toString());

        Person rector_unibuc = new Person("Marian", "Preda");
        University unibuc = new University("Universitatea din Bucuresti", rector_unibuc, 1864);
        Person rector_uniac = new Person("Tudorel", "Toader");
        University uniac = new University("Universitatea Alexandru Ioan Cuza Iasi", rector_uniac, 1860);
        Person rector_ubb = new Person("Daniel", "David");
        University ubb = new University("Universitatea Babes-Bolyai", rector_ubb, 1581);

        Student s1 = new Student("Razvan-Mihaita", "Ilie", LocalDate.of(2000,11,20), unibuc);
        System.out.println(s1.toString());

        Section aventura = new Section("Aventura");
        Section actiune = new Section("Actiune");
        Section poezie = new Section("Poezie");
        Section drama = new Section("Drama");
        Section selfhelp = new Section("Selfhelp");
        Section proza = new Section("Proza");
        SectionService sectionService = SectionService.getInstance();
        //sectionService.addSection(aventura);
        //sectionService.addSection(actiune);
        //sectionService.addSection(poezie);
        //sectionService.addSection(drama);
        //sectionService.addSection(selfhelp);
        //sectionService.addSection(proza);

        Book carte1 = new Book("Aventurile lui Bombonel", aventura, a1, LocalDate.of(1905, 10, 3));
        Book carte2 = new Book("Impuscaturile din Las Vegas", actiune, a2, LocalDate.of(1910,3,2));
        Book carte3 = new Book("Intamplarile lui Alice", aventura, a2, LocalDate.of(1920, 4, 29));
        Book carte4 = new Book("Amintiri din Copilarie", proza, a14, LocalDate.of(1888, 6, 10));
        Book carte5 = new Book("Moara cu noroc", drama, a15, LocalDate.of(1900, 6, 9));
        Book carte6 = new Book("Luceafarul", poezie, a3, LocalDate.of(1860, 5, 8));
        Book carte7 = new Book("12 reguli de viata", selfhelp, a20, LocalDate.of(2003, 10, 7));
        Book carte8 = new Book("Beyond Order", selfhelp, a20, LocalDate.of(2020, 2, 6));
        Book carte9 = new Book("Harry Potter", aventura, a19, LocalDate.of(2010, 2, 5));
        Book carte10 = new Book("Povestea lui Harap-Alb", proza, a14, LocalDate.of(1910, 9, 14));
        Book carte11 = new Book("Fata babei si fata mosului", proza, a14, LocalDate.of(1890, 11, 30));
        Book carte12 = new Book("Somnoroase pasarele", poezie, a3, LocalDate.of(1855, 4, 29));
        Book carte13 = new Book("Harry Potter 2", aventura, a19, LocalDate.of(2011, 1, 1));
        Book carte14 = new Book("Plumb", poezie, a17, LocalDate.of(1914, 5, 2));

        System.out.println(carte1.toString());
        System.out.println(carte2.toString());
        System.out.println(carte3.toString());

        BookService pietricica = BookService.getInstance();

//        pietricica.addBook(carte1);
//        pietricica.addBook(carte2);
//        pietricica.addBook(carte3);
//        pietricica.addBook(new Book("Dovada de disgratie", aventura, a2, LocalDate.of(1950, 3, 7)));
//        pietricica.addBook(carte4);
//        pietricica.addBook(carte5);
//        pietricica.addBook(carte6);
//        pietricica.addBook(carte7);
//        pietricica.addBook(carte8);
//        pietricica.addBook(carte9);
//        pietricica.addBook(carte10);
//        pietricica.addBook(carte12);
//        pietricica.addBook(carte11);
//        pietricica.addBook(carte13);
//        pietricica.addBook(carte14);

        ReaderService vaurechea = ReaderService.getInstance();
//        vaurechea.addReader(c1);
//        vaurechea.addReader(c2);
//        vaurechea.addReader(c10);
//        vaurechea.addReader(c11);
//        vaurechea.addReader(c12);
//        vaurechea.addReader(c13);
//        vaurechea.addReader(c14);
//        vaurechea.addReader(c15);
//        vaurechea.addReader(c16);
//        vaurechea.addReader(c18);
//        vaurechea.addReader(c17);
//        vaurechea.addReader(c20);
//        vaurechea.addReader(c19);
//        vaurechea.addReader(c21);
//        vaurechea.addReader(c22);
//        vaurechea.addReader(c23);

        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
        //vaurechea.showReaders();
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
        //pietricica.showBooks();
//Ilie Razvan-Mihaita grupa 242

        AuthorService authorService = AuthorService.getInstance();
//        authorService.addAuthor(a1);
//        authorService.addAuthor(a2);
//        authorService.addAuthor(a14);
//        authorService.addAuthor(a15);
//        authorService.addAuthor(a16);
//        authorService.addAuthor(a17);
//        authorService.showAuthors();
        ReadService readService = ReadService.getInstance();
        readService.readSections(sectionService);
        sectionService.showSections();
        auditService.logEvent("Se adauga sectiuni");

        readService.readAuthors(authorService);
        authorService.showAuthors();
        auditService.logEvent("Se adauga autori");

        readService.readBooks(pietricica);
        pietricica.showBooks();
        auditService.logEvent("Se adauga carti");

        readService.readReaders(vaurechea);
        vaurechea.showReaders();
        auditService.logEvent("Se adauga cititori");

        WriteService writeService = WriteService.getInstance();
        writeService.writeBooks(pietricica.getBooks());
        writeService.writeReaders(vaurechea.getReaders());
        WriteService.writeAuthors(authorService.getAuthors());
        writeService.writeSections(sectionService.getSections());

        try {
            Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbc_pao_irm", "root", "root");
            Statement statement = connection.createStatement();
            //ResultSet resultSet = statement.executeUpdate("INSERT INTO `jdbc_pao_irm`.`readers` (`firstname`, `lastname`, `birthdate`, `startdate`) VALUES ('Cumna', 'Adams', '2003-03-05', '2005-10-03');");
            //int xdddd = statement.executeUpdate("INSERT INTO `jdbc_pao_irm`.`readers` (`firstname`, `lastname`, `birthdate`, `startdate`) VALUES ('Cumna', 'Adams', '2003-03-05', '2005-10-03');");

//            while (resultSet.next()) {
//                System.out.println(resultSet.getString("firstname"));
//            }
            // resultSet.close();
            statement.close();
            connection.close();
        }
        catch (Exception e){
            e.printStackTrace();
        }



        authorService.updateAuthor(a2);
        pietricica.updateBook(carte13);
        sectionService.updateSection(actiune);
        vaurechea.updateReader(c23);
        sectionService.deleteSection(aventura);
        pietricica.deleteBook(carte6);
        authorService.deleteAuthor(a15);
        vaurechea.deleteReader(c16);
        pietricica.addBook(new Book("Dovada de disgratie 2", aventura, a2, LocalDate.of(1950, 3, 7)));

    }
}
