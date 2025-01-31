import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("შეიყვანეთ სტრიქონი: ");
        String input = scanner.nextLine();
        System.out.println("ციფრების რაოდენობა: " + DigitCounter.countDigits(input));

        System.out.println("წინადადებების რაოდენობა: " + SentenceCounter.countSentences(input));

        System.out.println("სტრიქონი პალინდრომია? " + (PalindromeChecker.isPalindrome(input) ? "კი" : "არა"));

        System.out.print("შეიყვანეთ s1: ");
        String s1 = scanner.nextLine();
        System.out.print("შეიყვანეთ s2: ");
        String s2 = scanner.nextLine();
        System.out.println("s2 არის s1-ის ქვესტრიქონი? " + (SubstringChecker.isSubstring(s1, s2) ? "კი" : "არა"));

        System.out.println(VowelOrConsonant.checkEnding(input));

        System.out.print("შეიყვანეთ სიტყვა ნიტას ჩარევის შემდეგ: ");
        String modifiedWord = scanner.nextLine();
        System.out.println("თავდაპირველი სიტყვა: " + NitaWordReconstructor.reconstructWord(modifiedWord));

        System.out.print("შეიყვანეთ უზარმაზარი სიტყვა: ");
        String hugeWord = scanner.nextLine();
        System.out.println("აბრევიატურა: " + HugeWordAbbreviation.abbreviateWord(hugeWord));

        scanner.close();
    }
}
