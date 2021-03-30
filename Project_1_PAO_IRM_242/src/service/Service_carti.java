package service;

import biblioteca.*;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Service_carti {

    private List<Carte> bookList;

    public Service_carti(){

        bookList = new ArrayList<>();
    }

    public void addBook(Carte c){

        bookList.add(new Carte(c));
        sortBook();

    }

    private void sortBook(){
        Collections.sort(bookList);
    }

    public void showBooks(){
        for (Carte c : bookList){
            System.out.println(c.toString());
        }
    }

}
