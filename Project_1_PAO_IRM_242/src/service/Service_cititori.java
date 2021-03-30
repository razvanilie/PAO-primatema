package service;

import biblioteca.*;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;


public class Service_cititori {

    private List<Cititor> readerList;

    public Service_cititori(){
        readerList = new ArrayList<>();
    }

    public void addReader(Cititor c){

        readerList.add(new Cititor(c));
        sortReaders();

    }

    private void sortReaders(){
        Collections.sort(readerList);
    }

    public void showReaders(){
        for (Cititor c : readerList){
            System.out.println(c.toString());
        }
    }
}
