import java.util.ArrayList;
import java.util.HashMap;

public class Student implements Comparable<Student> {
    private String id;
    private String firstName;
    private String lastName;
    private HashMap<String, ArrayList<Integer>> grades;

    public Student(String id, String firstName, String lastName) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.grades = new HashMap<>();
    }

    public void addGrade(String subject, int grade) {
        grades.putIfAbsent(subject, new ArrayList<>());
        grades.get(subject).add(grade);
    }

    public double getAverageGrade() {
        int sum = 0, count = 0;
        for (ArrayList<Integer> subjectGrades : grades.values()) {
            for (int grade : subjectGrades) {
                sum += grade;
                count++;
            }
        }
        return count == 0 ? 0 : (double) sum / count;
    }

    @Override
    public int compareTo(Student o) {
        return Double.compare(this.getAverageGrade(), o.getAverageGrade());
    }

    public String getId() {
        return id;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    @Override
    public String toString() {
        return id + " " + firstName + " " + lastName + " | Avg: " + getAverageGrade();
    }
}
