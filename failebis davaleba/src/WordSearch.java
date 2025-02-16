import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class WordSearch {
    public static void searchWordInFile(String searchWord) {
        try (BufferedReader reader = new BufferedReader(new FileReader("vephistqaosani.txt"))) {
            String line;
            boolean wordFound = false;

            while ((line = reader.readLine()) != null) {
                if (line.contains(searchWord)) {
                    wordFound = true;
                    break;
                }
            }

            if (wordFound) {
                System.out.println("The word '" + searchWord + "' was found in the file.");
            } else {
                System.out.println("The word '" + searchWord + "' was not found in the file.");
            }
        } catch (IOException e) {
            System.out.println("Error reading file: " + e.getMessage());
        }
    }
}
