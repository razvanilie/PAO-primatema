package model;

public class University {
    private String name;
    private Person rector;
    private int foundingYear;

    public University(String name){
        this.name = name;

    }

    public University(String name, Person rector, int foundingYear){
        this.name = name;
        this.rector = rector;
        this.foundingYear = foundingYear;
    }

    @Override
    public String toString() {
        return "University{" +
                "name='" + name + '\'' +
                ", rector=" + rector +
                ", foundingYear=" + foundingYear +
                '}';
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public Person getRector() {
        return rector;
    }

    public void setRector(Person rector) {
        this.rector = rector;
    }

    public int getFoundingYear() {
        return foundingYear;
    }

    public void setFoundingYear(int foundingYear) {
        this.foundingYear = foundingYear;
    }
}
