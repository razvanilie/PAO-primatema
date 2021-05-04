package service;

import model.*;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class AuthorService {

    private List<Author> authorList;
    private static AuthorService INSTANCE = null;

    private AuthorService(){

        authorList = new ArrayList<>();
    }

    public static AuthorService getInstance() {
        if (INSTANCE == null) {
            INSTANCE = new AuthorService();
        }
        return INSTANCE;
    }

    public void addAuthor(Author a){

        authorList.add(new Author(a));
        sortAuthor();

    }

    private void sortAuthor(){
        Collections.sort(authorList);
    }

    public void showAuthors(){
        for (Author a : authorList){
            System.out.println(a);
        }
    }

    public List<Author> getAuthors(){
        return authorList;
    }

}
