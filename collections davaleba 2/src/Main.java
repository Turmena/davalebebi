import java.util.*;

public class Main {
    public static void main(String[] args) {
        String[] words = {"apple", "banana", "apple", "orange", "banana", "banana"};
        WordCounter.countWords(words);

        List<Student> students = new ArrayList<>();
        Student s1 = new Student("1", "John", "wick");
        Student s2 = new Student("2", "Alice", "Smith");
        Student s3 = new Student("3", "Boby", "Martinez");

        s1.addGrade("Math", 9);
        s1.addGrade("Math", 8);
        s1.addGrade("English", 7);
        s2.addGrade("Math", 10);
        s2.addGrade("English", 9);
        s3.addGrade("Math", 6);
        s3.addGrade("English", 5);

        students.add(s1);
        students.add(s2);
        students.add(s3);

        Collections.sort(students);
        System.out.println("Sorted by average grade:");
        for (Student student : students) {
            System.out.println(student);
        }

        Collections.sort(students, new StudentLastNameComparator());
        System.out.println("\nSorted by last name:");
        for (Student student : students) {
            System.out.println(student);
        }
    }
}
