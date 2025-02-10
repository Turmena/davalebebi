import java.util.Scanner;

public class StringToIntDivision {
    public static void convertAndDivide() {
        Scanner scanner = new Scanner(System.in);
        try {
            System.out.print("შეიყვანეთ რიცხვი (String ფორმატში): ");
            String input = scanner.nextLine();
            int number = Integer.parseInt(input);
            int result = 100 / number;
            System.out.println("100 გაყოფილი თქვენს რიცხვზე: " + result);
        } catch (NumberFormatException e) {
            System.out.println("შეცდომა: გთხოვთ შეიყვანოთ მხოლოდ რიცხვი!");
        } catch (ArithmeticException e) {
            System.out.println("შეცდომა: ნულზე გაყოფა დაუშვებელია!");
        }
    }
}
