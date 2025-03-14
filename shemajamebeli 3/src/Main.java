import java.io.IOException;

//1.b
//2.a
//3.a,b,d
//4.c
//5.a,c
//6.b
//7.b
//8.b
//9.b
//10.c
//11.c
//12.b
//13.a,b,c
//14.d
//15.c
//II კოდის წერის სავარჯიშო 1
public class Main{
    public static void main(String[] args) {
        try {
            List<Student> students = FileUtil.readStudentsFromFile("students.txt");
            FileUtil.serializeStudents(Students, "students.dat");
            List<Student> deserializedStudents = FileUtil.deserializeStudents("students.dat");
            deserializedStudents.forEach(System.out::println);
        } catch (IOException  ClassNotFoundException e) {
            System.out.println("Error: " + e.getMessege());
        }
    }
}