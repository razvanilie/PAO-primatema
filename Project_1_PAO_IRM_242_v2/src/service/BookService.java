package service;

import model.*;

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
        sortBook();

    }

    private void sortBook(){
        Collections.sort(bookList);
    }

    public void showBooks(){
        for (Book c : bookList){
            System.out.println(c);
        }
    }

    public List<Book> getBooks(){
        return bookList;
    }

}
