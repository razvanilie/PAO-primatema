package biblioteca;

import java.time.LocalDate;

public class Autor extends Persoana{

    public Autor(){
        super();

    }

    public Autor(String firstName, String lastName){
        super(firstName, lastName);
    }

    public Autor(String firstName, String lastName, LocalDate birthDate){
        super(firstName, lastName, birthDate);
    }

    public Autor(Autor autor){
        super(autor.getFirstName(), autor.getLastName(), autor.getBirthDate());
    }
    @Override
    public String toString() {
        return super.toString().replace("Persoana{", "Autor{");
    }




}
