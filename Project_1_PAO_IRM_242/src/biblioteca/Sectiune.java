package biblioteca;

public class Sectiune {

    private String name;


    public Sectiune(String name){

        this.name = name;
    }

    @Override
    public String toString() {
        return '\'' + name + '\'';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
