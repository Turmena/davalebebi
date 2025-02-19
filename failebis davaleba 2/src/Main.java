import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("შეიყვანეთ სახელი, გვარი და ასაკი (გამოყავით space-ით):");
        String name = scanner.next();
        String surname = scanner.next();
        int age = scanner.nextInt();

        Human person1 = new Human(name, surname, age);

        person1.walk();

        Human person2 = new Human("გიორგი", "კალაძე", 25);
        person1.hangOut(person2);

        scanner.close();
    }
}
