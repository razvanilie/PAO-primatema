package model;

import java.time.LocalDate;

public class Student extends Reader {
    private University university;

    public Student(String firstName, String lastName, LocalDate birthDate){
        super(firstName, lastName, birthDate);
    }

    public Student(String firstName, String lastName, LocalDate birthDate, University university){
        super(firstName, lastName, birthDate);
        this.university = university;
    }

    public Student(String firstName, String lastName, LocalDate birthDate, LocalDate startDate){
        super(firstName, lastName, birthDate, startDate);
    }

    @Override
    public String toString() {
        return "Student{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", birthDate=" + birthDate +
                ", startDate=" + this.getStartDate() +
                ", university=" + university.getName() +
                '}';
    }

    @Override
    public boolean equals(Object o){

        if ((o instanceof Student) == false) {
            return false;
        }
        Student s = (Student) o;
        if(super.equals(o) == true) //i use == true so it's easier to read for me.
            return this.university.equals(s.getUniversity()) == true;
        else
            return false;
    }

    public void setUniversity(University university) {
        this.university = university;
    }

    public University getUniversity() {
        return university;
    }
}
