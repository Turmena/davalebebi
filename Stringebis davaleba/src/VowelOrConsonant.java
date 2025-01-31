public class VowelOrConsonant {
    public static String checkEnding(String input) {
        char lastChar = Character.toLowerCase(input.charAt(input.length() - 1));
        if ("aeiouAEIOU".indexOf(lastChar) != -1) {
            return "სტრიქონი მთავრდება ხმოვნით.";
        } else {
            return "სტრიქონი მთავრდება თანხმოვნით.";
        }
    }
}
