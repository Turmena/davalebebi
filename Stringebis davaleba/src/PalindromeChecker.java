public class PalindromeChecker {
    public static boolean isPalindrome(String input) {
        String cleaned = input.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
        return cleaned.equals(new StringBuilder(cleaned).reverse().toString());
    }
}
