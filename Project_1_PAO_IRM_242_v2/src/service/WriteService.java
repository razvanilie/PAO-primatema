package service;

import model.*;

import java.io.BufferedWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.sql.Timestamp;
import java.util.Date;
import java.util.List;

public class WriteService {

    private static WriteService INSTANCE;

    private WriteService () {}

    public static WriteService getInstance() {
        if (INSTANCE == null) {
            INSTANCE = new WriteService();
        }
        return INSTANCE;
    }


    private static final String DIRECTORY_PATH = "files/info";

    public void writeBooks (List<Book> bookList) {
        String FILE_PATH = DIRECTORY_PATH + "/books.csv";
        try {
            BufferedWriter writer = Files.newBufferedWriter(Paths.get(FILE_PATH),
                    StandardOpenOption.TRUNCATE_EXISTING);
            writer.write("title,authorFirstName,authorLastName,authorBirthDate,section,publishDate\n");
            writer.flush();
            for (Book book : bookList)
                if (book != null) {
                    writer.write(book.getTitle() + "," + book.getAuthor().getFirstName() +  "," + book.getAuthor().getLastName() + "," + book.getAuthor().getBirthDate() + "," + book.getSection() + "," +
                            book.getPublishDate() + "\n");
                    writer.flush();
                }
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
    public void writeReaders (List<Reader> readerList) {
        String FILE_PATH = DIRECTORY_PATH + "/readers.csv";
        try {
            BufferedWriter writer = Files.newBufferedWriter(Paths.get(FILE_PATH),
                    StandardOpenOption.TRUNCATE_EXISTING);
            writer.write("firstName,lastName,birthDate,startDate\n");
            writer.flush();
            for (Reader reader : readerList)
                if (reader != null) {
                    writer.write(reader.getFirstName() + "," + reader.getLastName() +  "," + reader.getBirthDate() + "," + reader.getStartDate() + "\n");
                    writer.flush();
                }
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
    public void writeSections (List<Section> sectionList) {
        String FILE_PATH = DIRECTORY_PATH + "/sections.csv";
        try {
            BufferedWriter writer = Files.newBufferedWriter(Paths.get(FILE_PATH),
                    StandardOpenOption.TRUNCATE_EXISTING);
            writer.write("name\n");
            writer.flush();
            for (Section section : sectionList)
                if (section != null) {
                    writer.write(section.getName() + "\n");
                    writer.flush();
                }
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
    public static void writeAuthors(List<Author> authorList) {
        String FILE_PATH = DIRECTORY_PATH + "/authors.csv";
        try {
            BufferedWriter writer = Files.newBufferedWriter(Paths.get(FILE_PATH),
                    StandardOpenOption.TRUNCATE_EXISTING);
            writer.write("firstName,lastName,birthDate\n");
            writer.flush();
            for (Author author : authorList)
                if (author != null) {
                    writer.write(author.getFirstName() + "," + author.getLastName() +  "," + author.getBirthDate() + "\n");
                    writer.flush();
                }
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }



}
