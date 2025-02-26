import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Data {
    private static final String FILE_NAME = "contacts.txt";

    public static void saveContacts(List<PhoneContact> contacts) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(FILE_NAME))) {
            for (PhoneContact contact : contacts) {
                writer.write(contact.getFirstName() + "," + contact.getLastName() + "," +
                        contact.getPhoneNumber() + "," + contact.getEmail());
                writer.newLine();
            }
        } catch (IOException e) {
            System.out.println("Error saving contacts: " + e.getMessage());
        }
    }

    public static List<PhoneContact> loadContacts() {
        List<PhoneContact> contacts = new ArrayList<>();
        try (BufferedReader reader = new BufferedReader(new FileReader(FILE_NAME))) {
            String line;
            while ((line = reader.readLine()) != null) {
                String[] data = line.split(",");
                if (data.length == 4) {
                    PhoneContact contact = new PhoneContact(data[0], data[1], data[2], data[3]);
                    contacts.add(contact);
                }
            }
        } catch (IOException e) {
            System.out.println("Error loading contacts: " + e.getMessage());
        }
        return contacts;
    }
}
