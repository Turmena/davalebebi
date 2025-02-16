import java.io.FileWriter;
import java.io.IOException;

public class FileWriterExample {
    public static void writeTextToFile() {
        String text = "შიგან ასრე გავერივე, გნოლის ჯოგსა ვითა ქორი,\n" +
                "კაი კაცსა შემოვსტყორცე, ცხენ-კაცისა დავდგი გორი;\n" +
                "კაცი, ჩემგან განატყორცნა ბრუნავს ვითა ტანაჯორი,\n" +
                "ერთობ სრულად ამოვწყვიდე წინა კერძო რაზმი ორი";

        try (FileWriter writer = new FileWriter("vephistqaosani.txt")) {
            writer.write(text);
        } catch (IOException e) {
            System.out.println("Error writing to file: " + e.getMessage());
        }
    }
}
