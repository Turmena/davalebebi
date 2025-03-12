import java.util.ArrayList;
import java.util.Date;
import java.util.Comparator;

public class Student implements Comparable<Student> {
    private String firstName;
    private String lastName;
    private Date birthDate;
    private ArrayList<Integer> grades;

    public Student(String firstName, String lastName, Date birthDate, ArrayList<Integer> grades) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.birthDate = birthDate;
        this.grades = grades;
    }

    public double getAverageGrade() {
        return grades.stream().mapToInt(Integer::intValue).average().orElse(0.0);
    }

    public Date getBirthDate() {
        return birthDate;
    }

    @Override
    public int compareTo(Student o) {
        return (this.firstName + this.lastName).compareTo(o.firstName + o.lastName);
    }

    @Override
    public String toString() {
        return firstName + " " + lastName + " | Avg: " + getAverageGrade() + " | Birthdate: " + birthDate;
    }
}

class StudentByAverage implements Comparator<Student> {
    @Override
    public int compare(Student o1, Student o2) {
        return Double.compare(o2.getAverageGrade(), o1.getAverageGrade());
    }
}

class StudentByBirthDate implements Comparator<Student> {
    @Override
    public int compare(Student o1, Student o2) {
        return o1.getBirthDate().compareTo(o2.getBirthDate());
    }
}
