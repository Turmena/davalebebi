public class SentenceCounter {
    public static int countSentences(String input) {
        return input.split("[.?!;]").length;
    }
}
