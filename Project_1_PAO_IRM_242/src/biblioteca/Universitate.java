package biblioteca;

public class Universitate {
    private String name;
    private Persoana rector;
    private int foundingYear;

    public Universitate(String name){
        this.name = name;

    }

    public Universitate(String name, Persoana rector, int foundingYear){
        this.name = name;
        this.rector = rector;
        this.foundingYear = foundingYear;
    }

    @Override
    public String toString() {
        return "Universitate{" +
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

    public Persoana getRector() {
        return rector;
    }

    public void setRector(Persoana rector) {
        this.rector = rector;
    }

    public int getFoundingYear() {
        return foundingYear;
    }

    public void setFoundingYear(int foundingYear) {
        this.foundingYear = foundingYear;
    }
}
