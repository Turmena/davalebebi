import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    private static final String FILE_NAME = "contacts.dat";

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<PhoneContact> contacts = Data.loadContacts();

        while (true) {
            System.out.println("\nPhone Book Application");
            System.out.println("1. Add contact");
            System.out.println("2. Edit contact");
            System.out.println("3. Delete contact");
            System.out.println("4. Show contacts");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1:
                    addContact(scanner, contacts);
                    break;
                case 2:
                    editContact(scanner, contacts);
                    break;
                case 3:
                    deleteContact(scanner, contacts);
                    break;
                case 4:
                    showContacts(contacts);
                    break;
                case 5:
                    Data.saveContacts(contacts);
                    System.out.println("Exiting...");
                    return;
                default:
                    System.out.println("Invalid choice. Try again.");
            }
        }
    }

    private static void addContact(Scanner scanner, List<PhoneContact> contacts) {
        System.out.print("Enter first name: ");
        String firstName = scanner.nextLine();
        System.out.print("Enter last name: ");
        String lastName = scanner.nextLine();
        System.out.print("Enter phone number: ");
        String phoneNumber = scanner.nextLine();
        System.out.print("Enter email: ");
        String email = scanner.nextLine();

        PhoneContact newContact = new PhoneContact(firstName, lastName, phoneNumber, email);
        contacts.add(newContact);
        Data.saveContacts(contacts);
        System.out.println("Contact added successfully.");
    }

    private static void editContact(Scanner scanner, List<PhoneContact> contacts) {
        showContacts(contacts);
        System.out.print("Enter the index of the contact to edit: ");
        int index = scanner.nextInt();
        scanner.nextLine();

        if (index >= 0 && index < contacts.size()) {
            PhoneContact contact = contacts.get(index);
            System.out.print("Enter new first name (leave blank to keep current): ");
            String firstName = scanner.nextLine();
            if (!firstName.isEmpty()) contact.setFirstName(firstName);

            System.out.print("Enter new last name (leave blank to keep current): ");
            String lastName = scanner.nextLine();
            if (!lastName.isEmpty()) contact.setLastName(lastName);

            System.out.print("Enter new phone number (leave blank to keep current): ");
            String phoneNumber = scanner.nextLine();
            if (!phoneNumber.isEmpty()) contact.setPhoneNumber(phoneNumber);

            System.out.print("Enter new email (leave blank to keep current): ");
            String email = scanner.nextLine();
            if (!email.isEmpty()) contact.setEmail(email);

            Data.saveContacts(contacts);
            System.out.println("Contact edited successfully.");
        } else {
            System.out.println("Invalid index.");
        }
    }

    private static void deleteContact(Scanner scanner, List<PhoneContact> contacts) {
        showContacts(contacts);
        System.out.print("Enter the index of the contact to delete: ");
        int index = scanner.nextInt();
        scanner.nextLine();

        if (index >= 0 && index < contacts.size()) {
            contacts.remove(index);
            Data.saveContacts(contacts);
            System.out.println("Contact deleted successfully.");
        } else {
            System.out.println("Invalid index.");
        }
    }

    private static void showContacts(List<PhoneContact> contacts) {
        if (contacts.isEmpty()) {
            System.out.println("No contacts available.");
        } else {
            for (int i = 0; i < contacts.size(); i++) {
                System.out.println(i + ": " + contacts.get(i));
            }
        }
    }
}
