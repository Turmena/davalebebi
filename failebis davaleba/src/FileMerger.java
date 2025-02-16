import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileMerger {
    public static void mergeFiles() {
        try (BufferedReader reader1 = new BufferedReader(new FileReader("vephistqaosani.txt"));
             BufferedReader reader2 = new BufferedReader(new FileReader("newText.txt"));
             FileWriter writer = new FileWriter("mergedFile.txt")) {

            writer.write("first file\n");
            String line;
            while ((line = reader1.readLine()) != null) {
                writer.write(line + "\n");
            }

            writer.write("\nsecond file\n");
            while ((line = reader2.readLine()) != null) {
                writer.write(line + "\n");
            }
        } catch (IOException e) {
            System.out.println("Error reading/writing file: " + e.getMessage());
        }
    }
}
