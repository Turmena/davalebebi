public class SquareRootCalculator {
    public static double calculateSquareRoot(int number) throws IllegalArgumentException {
        if (number < 0) {
            throw new IllegalArgumentException("შეცდომა: უარყოფით რიცხვს არ აქვს რეალური კვადრატული ფესვი!");
        }
        return Math.sqrt(number);
    }
}
