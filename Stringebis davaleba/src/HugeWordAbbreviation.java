public class HugeWordAbbreviation {
    public static String abbreviateWord(String word) {
        if (word.length() > 10) {
            return word.charAt(0) + String.valueOf(word.length() - 2) + word.charAt(word.length() - 1);
        } else {
            return "სიტყვა უზარმაზარი არ არის.";
        }
    }
}
