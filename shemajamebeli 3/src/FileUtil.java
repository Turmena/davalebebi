import java.io.*;
import java.sql.Array;
import java.util.ArrayList;
import java.util.List;

public class FileUtil {
    public static List<Student>
    readStudentsFromFile(String filename)
        throws IOException {
        List<Student> students = new ArrayList<>();
        try (BufferedReader br = new BufferedReader(new FileReader(filename))) {
            String Line;
            while ((Line = br.readLine()) != null) {
                String[] data = Line.split(",");
                int id = Integer.parseInt(data[0].trim());
                String firstName = data[1].trim();
                String LastName = data[2].trim();
                int Year = Integer.parseInt(data[3].trim());
                double grade = Double.parseDouble(data[4].trim());
                List<String> subjects = List.of(data[5].trim().split(" "));
                Student student = new Student(id, firstName, LastName, Year, grade, subjects);

                students.add(student);
            }
        }
        return students;
    }

    public static void serializeStudents(List<Student>studnets, String fileName)
        throws IOException {
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(filename))) {
            oos.writeObject(studnets);
        }
    }

    public static List<Student> deserializeStudents(String filename)
        throws IOException, ClassNotFoundException {
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(filename))) {
            return (list<Student>)ois.readObject();
        }
    }
}
