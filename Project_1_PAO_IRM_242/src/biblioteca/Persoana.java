package biblioteca;


import java.time.LocalDate;

public class Persoana implements Comparable<Persoana>{

    protected String firstName;
    protected String lastName;
    protected LocalDate birthDate;

    public Persoana(){
        this.firstName = "Randon zis";
        this.lastName = "Random";
        this.birthDate = LocalDate.of(2000,10,20);
    }

    public Persoana(String firstName, String lastName){

        this.firstName = firstName;
        this.lastName = lastName;
        this.birthDate = LocalDate.of(1,1,1);
    }

    public Persoana(String firstName, String lastName, LocalDate birthDate){

        this.firstName = firstName;
        this.lastName = lastName;
        this.birthDate = birthDate;
    }

    public Persoana(Persoana persoana){

        this.firstName = persoana.getFirstName();
        this.lastName = persoana.getLastName();
        this.birthDate = persoana.getBirthDate();
    }

    public String getLastName() {
        return lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public LocalDate getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(LocalDate birthDate) {
        this.birthDate = birthDate;
    }

    @Override
    public String toString() {
        if(birthDate.equals(LocalDate.of(1,1,1)))
            return "Persoana{" +
                    "firstName='" + firstName + '\'' +
                    ", lastName='" + lastName + '\'' +
                    ", birthDate= undefined}";
        return "Persoana{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", birthDate=" + birthDate +
                '}';
    }

    @Override
    public boolean equals(Object o){

        Persoana p = (Persoana) o;
        return this.firstName.equals(p.getFirstName()) == true && this.lastName.equals(p.getLastName()) == true && this.birthDate.equals(p.getBirthDate()) == true;
    }

    @Override
    public int compareTo(Persoana p) {

        if(this.lastName.equals(p.getLastName()) == true)
            if(this.firstName.equals(p.getFirstName()) == true)
                return this.birthDate.compareTo(p.getBirthDate());
            else
                return this.firstName.compareTo(p.getFirstName());
        else
            return this.lastName.compareTo(p.getLastName());
    }
}
