package service;

import model.*;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;


public class ReaderService {

    private List<Reader> readerList;
    private static ReaderService INSTANCE = null;

    private ReaderService(){
        readerList = new ArrayList<>();
    }

    public static ReaderService getInstance() {
        if (INSTANCE == null) {
            INSTANCE = new ReaderService();
        }
        return INSTANCE;
    }

    public void addReader(Reader c){

        readerList.add(new Reader(c));
        sortReaders();

    }

    private void sortReaders(){
        Collections.sort(readerList);
    }

    public void showReaders(){
        for (Reader c : readerList){
            System.out.println(c.toString());
        }
    }


    public List<Reader> getReaders(){
        return readerList;
    }
}
