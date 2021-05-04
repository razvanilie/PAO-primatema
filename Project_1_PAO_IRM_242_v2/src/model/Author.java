package model;

import java.time.LocalDate;

public class Author extends Person {

    public Author(){
        super();

    }

    public Author(String firstName, String lastName){
        super(firstName, lastName);
    }

    public Author(String firstName, String lastName, LocalDate birthDate){
        super(firstName, lastName, birthDate);
    }

    public Author(Author author){
        super(author.getFirstName(), author.getLastName(), author.getBirthDate());
    }
    @Override
    public String toString() {
        return super.toString().replace("Person{", "Author{");
    }




}
