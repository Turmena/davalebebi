public class DigitCounter {
    public static int countDigits(String input) {
        int count = 0;
        for (char ch : input.toCharArray()) {
            if (Character.isDigit(ch)) {
                count++;
            }
        }
        return count;
    }
}
