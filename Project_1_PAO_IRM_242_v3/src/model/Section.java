package model;

public class Section implements Comparable<Section>{

    private String name;


    public Section(String name){

        this.name = name;
    }

    public Section(Section section){
        this.name = section.getName();
    }

    @Override
    public String toString() {
        return name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public int compareTo(Section s) {

        return this.name.compareTo(s.getName());
    }
}
