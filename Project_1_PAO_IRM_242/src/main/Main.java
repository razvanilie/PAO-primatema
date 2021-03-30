package main;

import java.time.LocalDate;
import biblioteca.*;
import service.*;


public class Main {

    public static void main(String[] args) {

        Persoana p1 = new Persoana("Andrei", "Mihai", LocalDate.of(1999, 10, 5));
        Persoana p3 = new Persoana("Andrei", "Mihai", LocalDate.of(1999, 10, 5));

        System.out.println(p1.toString());

        Persoana p2 = new Persoana();
        Persoana p4 = new Persoana("Mihai-George", "Mocanu", LocalDate.of(1980, 12, 10));
        Persoana p10 = new Persoana("Amir", "Majeri", LocalDate.of(2009, 1, 9));
        Persoana p6 = new Persoana("Eduardo", "Ilie", LocalDate.of(2003, 5, 17));
        Persoana p7 = new Persoana("Gabriel", "Ilie", LocalDate.of(1959, 3, 25));
        Persoana p8 = new Persoana("Ilinca-Maria", "Ilie", LocalDate.of(2000, 11, 15));
        Persoana p9 = new Persoana("Gabriel Constantin", "Richiteanu", LocalDate.of(1999, 10, 3));
        System.out.println(p2.toString());

        if (p3.equals(p1) == true) {

            System.out.println("Matrix: persoane identice");

        }
        else
            System.out.println("Persoanele sunt speciale/diferite");

        System.out.println(p2.compareTo(p1));

        Autor a1 = new Autor();
        Autor a2 = new Autor("Aurel", "Aur", LocalDate.of(1900, 1, 10));
        Autor a3 = new Autor("Mihai", "Eminescu", LocalDate.of(1905, 6, 25));
        Autor a14 = new Autor("Ion", "Creanga", LocalDate.of(2005, 4, 13));
        Autor a15 = new Autor("Ioan", "Slavici", LocalDate.of(1940, 1, 1));
        Autor a16 = new Autor("Tudor", "Arghezi", LocalDate.of(1935, 10, 3));
        Autor a17 = new Autor("George", "Bacovia", LocalDate.of(1922, 12, 16));
        Autor a18 = new Autor("Mircea", "Cartarescu", LocalDate.of(1877, 7, 15));
        Autor a19 = new Autor("Joanne", "Rowling", LocalDate.of(1883, 10, 15));
        Autor a20 = new Autor("Jordan", "Peterson", LocalDate.of(1989, 8, 22));
        System.out.println(a1.toString());
        System.out.println(a2.toString());
        System.out.println(a3.toString());

        System.out.println(a3.toString());

        System.out.println(a1.compareTo(p2));

        Cititor c1 = new Cititor();
        System.out.println(c1.getStart_date());

        System.out.println(c1.toString());
        Cititor c2 = new Cititor("Florian", "Fadrei", LocalDate.of(2000, 10, 12), LocalDate.now());
        Cititor c10 = new Cititor("Mihaita", "Marcu", LocalDate.of(2002, 5, 23), LocalDate.now());
        Cititor c11 = new Cititor("Razvan", "Sandu", LocalDate.of(2001, 3, 24), LocalDate.now());
        Cititor c12 = new Cititor("Carmen", "Ursu", LocalDate.of(2000, 4, 14), LocalDate.now());
        Cititor c13 = new Cititor("Ioana", "Ilie", LocalDate.of(1995, 5, 2), LocalDate.now());
        Cititor c14 = new Cititor("Daniela", "Neagu", LocalDate.of(1992, 6, 12), LocalDate.now());
        Cititor c15 = new Cititor("Florenza", "Sava", LocalDate.of(1992, 7, 3), LocalDate.now());
        Cititor c16 = new Cititor("Angel", "Apostol", LocalDate.of(1997, 8, 16), LocalDate.of(2019,3,26));
        Cititor c17 = new Cititor("Cosmina", "Lupu", LocalDate.of(1980, 9, 7), LocalDate.of(2020,6,6));
        Cititor c18 = new Cititor("Alexia", "Margarit", LocalDate.of(1994, 10, 23), LocalDate.of(2018,5,7));
        Cititor c19 = new Cititor("Adrian-Gabriel", "Prodan", LocalDate.of(2000, 11, 30), LocalDate.of(2016,10,14));
        Cititor c20 = new Cititor("Ion", "Radulescu", LocalDate.of(2001, 12, 29), LocalDate.of(2015,2,25));
        Cititor c21 = new Cititor("Andrei", "Tudoran", LocalDate.of(1922, 3, 14), LocalDate.of(2015,2,2));
        Cititor c22 = new Cititor("Florina", "Popa", LocalDate.of(1944, 3, 5), LocalDate.of(2018,4,3));
        Cititor c23 = new Cititor("Denis", "Adam", LocalDate.of(2003, 3, 5), LocalDate.of(2014,3,4));
        System.out.println(c2.toString());

        Cititor c3 = new Cititor(c2);
        System.out.println(c3.toString());

        Persoana p5 = new Persoana("Andrie", "Marius");
        System.out.println(p5.toString());

        Cititor a5 = new Cititor("Frate", "Eu");
        System.out.println(a5.toString());

        Persoana rector_unibuc = new Persoana("Marian", "Preda");
        Universitate unibuc = new Universitate("Universitatea din Bucuresti", rector_unibuc, 1864);
        Persoana rector_uniac = new Persoana("Tudorel", "Toader");
        Universitate uniac = new Universitate("Universitatea Alexandru Ioan Cuza Iasi", rector_uniac, 1860);
        Persoana rector_ubb = new Persoana("Daniel", "David");
        Universitate ubb = new Universitate("Universitatea Babes-Bolyai", rector_ubb, 1581);

        Student s1 = new Student("Razvan-Mihaita", "Ilie", LocalDate.of(2000,11,20), unibuc);
        System.out.println(s1.toString());

        Sectiune aventura = new Sectiune("Aventura");
        Sectiune actiune = new Sectiune("Actiune");
        Sectiune poezie = new Sectiune("Poezie");
        Sectiune drama = new Sectiune("Drama");
        Sectiune selfhelp = new Sectiune("Selfhelp");
        Sectiune proza = new Sectiune("Proza");

        Carte carte1 = new Carte("Aventurile lui Bombonel", aventura, a1, LocalDate.of(1905, 10, 3));
        Carte carte2 = new Carte("Impuscaturile din Las Vegas", actiune, a2, LocalDate.of(1910,3,2));
        Carte carte3 = new Carte("Intamplarile lui Alice", aventura, a2, LocalDate.of(1920, 4, 29));
        Carte carte4 = new Carte("Amintiri din Copilarie", proza, a14, LocalDate.of(1888, 6, 10));
        Carte carte5 = new Carte("Moara cu noroc", drama, a15, LocalDate.of(1900, 6, 9));
        Carte carte6 = new Carte("Luceafarul", poezie, a3, LocalDate.of(1860, 5, 8));
        Carte carte7 = new Carte("12 reguli de viata", selfhelp, a20, LocalDate.of(2003, 10, 7));
        Carte carte8 = new Carte("Beyond Order", selfhelp, a20, LocalDate.of(2020, 2, 6));
        Carte carte9 = new Carte("Harry Potter", aventura, a19, LocalDate.of(2010, 2, 5));
        Carte carte10 = new Carte("Povestea lui Harap-Alb", proza, a14, LocalDate.of(1910, 9, 14));
        Carte carte11 = new Carte("Fata babei si fata mosului", proza, a14, LocalDate.of(1890, 11, 30));
        Carte carte12 = new Carte("Somnoroase pasarele", poezie, a3, LocalDate.of(1855, 4, 29));
        Carte carte13 = new Carte("Harry Potter 2", aventura, a19, LocalDate.of(2011, 1, 1));
        Carte carte14 = new Carte("Plumb", poezie, a17, LocalDate.of(1914, 5, 2));

        System.out.println(carte1.toString());
        System.out.println(carte2.toString());
        System.out.println(carte3.toString());

        Service_carti pietricica = new Service_carti();

        pietricica.addBook(carte1);
        pietricica.addBook(carte2);
        pietricica.addBook(carte3);
        pietricica.addBook(new Carte("Dovada de disgratie", aventura, a2, LocalDate.of(1950, 3, 7)));
        pietricica.addBook(carte4);
        pietricica.addBook(carte5);
        pietricica.addBook(carte6);
        pietricica.addBook(carte7);
        pietricica.addBook(carte8);
        pietricica.addBook(carte9);
        pietricica.addBook(carte10);
        pietricica.addBook(carte12);
        pietricica.addBook(carte11);
        pietricica.addBook(carte13);
        pietricica.addBook(carte14);

        Service_cititori vaurechea = new Service_cititori();
        vaurechea.addReader(c1);
        vaurechea.addReader(c2);
        vaurechea.addReader(c10);
        vaurechea.addReader(c11);
        vaurechea.addReader(c12);
        vaurechea.addReader(c13);
        vaurechea.addReader(c14);
        vaurechea.addReader(c15);
        vaurechea.addReader(c16);
        vaurechea.addReader(c18);
        vaurechea.addReader(c17);
        vaurechea.addReader(c20);
        vaurechea.addReader(c19);
        vaurechea.addReader(c21);
        vaurechea.addReader(c22);
        vaurechea.addReader(c23);

        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
        vaurechea.showReaders();
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
        pietricica.showBooks();

//Ilie Razvan-Mihaita grupa 242

    }
}
