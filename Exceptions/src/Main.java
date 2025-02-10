import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        DivisionCalculator.divideNumbers();

        StringToIntDivision.convertAndDivide();

        System.out.print("შეიყვანეთ რიცხვი (უარყოფითი შემოწმებისთვის): ");
        int num = scanner.nextInt();
        try {
            NegativeNumberChecker.checkNegativeNumber(num);
        } catch (NegativeNumberException e) {
            System.out.println(e.getMessage());
        }

        System.out.print("შეიყვანეთ რიცხვი კვადრატული ფესვისთვის: ");
        int sqrtNum = scanner.nextInt();
        try {
            double result = SquareRootCalculator.calculateSquareRoot(sqrtNum);
            System.out.println("კვადრატული ფესვი: " + result);
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }

        scanner.close();
    }
}
