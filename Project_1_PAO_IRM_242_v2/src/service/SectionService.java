package service;

import model.*;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SectionService {

    private List<Section> sectionList;
    private static SectionService INSTANCE = null;

    private SectionService(){

        sectionList = new ArrayList<>();
    }

    public static SectionService getInstance() {
        if (INSTANCE == null) {
            INSTANCE = new SectionService();
        }
        return INSTANCE;
    }

    public void addSection(Section s){

        sectionList.add(new Section(s));
        sortSections();

    }

    private void sortSections(){
        Collections.sort(sectionList);
    }

    public void showSections(){
        for (Section s : sectionList){
            System.out.println(s);
        }
    }

    public List<Section> getSections(){
        return sectionList;
    }
}
