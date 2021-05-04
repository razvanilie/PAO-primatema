package service;

import model.*;

import java.io.*;
import java.nio.file.*;
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
            }
        } catch (IOException e) {
            System.out.println(e.getClass() + " " + e.getMessage());
        }
    }

}
