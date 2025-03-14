import java.io.Serializable;
import java.util.List;

public class Student implements Serializable {
    private int id;
    private String firstName;
    private String LastName;
    private int Year;
    private double grade;
    private List<String> subjects;
    public Student(int id, String firstName, String LastName, int Year, double grade, List<String> subjects
    ){
        this.id = id;
        this.firstName = firstName;
        this.LastName = LastName;
        this.Year = Year;
        this.grade = grade;
        this.subjects = subjects;
    }

    @Override
    public String toString() {
        return "ID: " + ", Name: " + firstName + " " + LastName + ", Year: "+ Year + ", Grade: " + grade + ", Subjects: " + subjects;
    }
}