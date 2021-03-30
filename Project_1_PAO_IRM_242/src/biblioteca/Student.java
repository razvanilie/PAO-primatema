package biblioteca;

import java.time.LocalDate;

public class Student extends Cititor{
    private Universitate university;

    public Student(String firstName, String lastName, LocalDate birthDate){
        super(firstName, lastName, birthDate);
    }

    public Student(String firstName, String lastName, LocalDate birthDate, Universitate university){
        super(firstName, lastName, birthDate);
        this.university = university;
    }

    public Student(String firstName, String lastName, LocalDate birthDate, LocalDate start_date){
        super(firstName, lastName, birthDate, start_date);
    }

    @Override
    public String toString() {
        return "Student{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", birthDate=" + birthDate +
                ", start_date=" + start_date +
                ", university=" + university.getName() +
                '}';
    }

    @Override
    public boolean equals(Object o){

        Student s = (Student) o;
        if(super.equals(o) == true)
            return this.university.equals(s.getUniversity()) == true;
        else
            return false;
    }

    public void setUniversity(Universitate university) {
        this.university = university;
    }

    public Universitate getUniversity() {
        return university;
    }
}
