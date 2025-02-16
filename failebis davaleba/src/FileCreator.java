import java.io.FileWriter;
import java.io.IOException;

public class FileCreator {
    public static void createNewFile() {
        String text = "Assure polite his real and other figures though. Day age advantages\n" +
                "and sufficient eating expression traveling. Of on am father by agreed\n" +
                "supply rather either. Own handsome delicate property mistresses her\n" +
                "end appetite. Mean are sons too sold nor said. Son share three men\n" +
                "power by you. Now merits wonder effect garret own.";

        try (FileWriter writer = new FileWriter("newText.txt")) {
            writer.write(text);
        } catch (IOException e) {
            System.out.println("Error writing to file: " + e.getMessage());
        }
    }
}
