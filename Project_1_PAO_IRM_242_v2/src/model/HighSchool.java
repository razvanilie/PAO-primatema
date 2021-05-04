package model;

public class HighSchool {
    private String name;
    private Person director;
    private int foundingYear;


    public HighSchool(String name){
        this.name = name;

    }

    public HighSchool(String name, Person director, int foundingYear){
        this.name = name;
        this.director = director;
        this.foundingYear = foundingYear;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Person getDirector() {
        return director;
    }

    public void setDirector(Person director) {
        this.director = director;
    }

    public int getFoundingYear() {
        return foundingYear;
    }

    public void setFoundingYear(int foundingYear) {
        this.foundingYear = foundingYear;
    }

    @Override
    public String toString() {
        return "HighSchool{" +
                "name='" + name + '\'' +
                ", rector=" + director +
                ", foundingYear=" + foundingYear +
                '}';
    }
}
