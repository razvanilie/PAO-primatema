package biblioteca;

import java.time.LocalDate;

public class Cititor extends Persoana{
    LocalDate start_date;

    public Cititor(){
        super();
        this.start_date = LocalDate.now();
    }

    public Cititor(String firstName, String lastName, LocalDate birthDate){
        super(firstName, lastName, birthDate);
        this.start_date = LocalDate.now();
    }

    public Cititor(String firstName, String lastName){
        super(firstName, lastName);
        this.start_date = LocalDate.now();
    }

    public Cititor(String firstName, String lastName, LocalDate birthDate, LocalDate start_date){

        super(firstName, lastName, birthDate);
        this.start_date = start_date;

    }

    public Cititor(Cititor c1){
        super(c1);
        this.start_date = c1.getStart_date();
    }

    public Cititor(Persoana p1){
        super(p1);
        this.start_date = LocalDate.now();
    }

    public LocalDate getStart_date() {
        return start_date;
    }

    public void setStart_date(LocalDate start_date) {
        this.start_date = start_date;
    }

    @Override
    public String toString() {
        if(birthDate.equals(LocalDate.of(1,1,1)))
            return "Cititor{" +
                    "firstanme='" + firstName + '\'' +
                    ", lastName='" + lastName + '\'' +
                    ", birthDate= undefined" +
                    ", start_date=" + start_date +
                    '}';
        return "Cititor{" +
                "firstanme='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", birthDate='" + birthDate +
                ", start_date=" + start_date +
                '}';
    }


}
