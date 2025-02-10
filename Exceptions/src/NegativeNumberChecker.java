public class NegativeNumberChecker {
    public static void checkNegativeNumber(int number) throws NegativeNumberException {
        if (number < 0) {
            throw new NegativeNumberException("შეცდომა: რიცხვი უარყოფითია!");
        } else {
            System.out.println("რიცხვი დადებითია: " + number);
        }
    }
}
