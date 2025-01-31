public class NitaWordReconstructor {
    public static String reconstructWord(String input) {
        StringBuilder original = new StringBuilder();
        for (int i = 0; i < input.length(); i++) {
            if (i == 0 || input.charAt(i) != input.charAt(i - 1)) {
                original.append(input.charAt(i));
            }
        }
        return original.toString();
    }
}
