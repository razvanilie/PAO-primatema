package model;

import java.time.LocalDate;

public class Reader extends Person {
    private LocalDate startDate;

    public Reader(){
        super();
        this.startDate = LocalDate.now();
    }

    public Reader(String firstName, String lastName, LocalDate birthDate){
        super(firstName, lastName, birthDate);
        this.startDate = LocalDate.now();
    }

    public Reader(String firstName, String lastName){
        super(firstName, lastName);
        this.startDate = LocalDate.now();
    }

    public Reader(String firstName, String lastName, LocalDate birthDate, LocalDate startDate){

        super(firstName, lastName, birthDate);
        this.startDate = startDate;

    }

    public Reader(Reader c1){
        super(c1);
        this.startDate = c1.getStartDate();
    }

    public Reader(Person p1){
        super(p1);
        this.startDate = LocalDate.now();
    }

    public LocalDate getStartDate() {
        return startDate;
    }

    public void setStartDate(LocalDate startDate) {
        this.startDate = startDate;
    }

    @Override
    public String toString() {
        if(birthDate.equals(LocalDate.of(1,1,1)))
            return "Reader{" +
                    "firstName='" + firstName + '\'' +
                    ", lastName='" + lastName + '\'' +
                    ", birthDate= undefined" +
                    ", startDate=" + startDate +
                    '}';
        return "Reader{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", birthDate='" + birthDate +
                ", startDate=" + startDate +
                '}';
    }


}
