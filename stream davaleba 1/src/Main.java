import java.util.*;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(5, 12, 3, 8, 20, 15);
        int sumOfSquares = numbers.stream()
                .filter(n -> n >= 10)
                .map(n -> n * n)
                .mapToInt(Integer::intValue)
                .sum();
        System.out.println("Sum of squares: " + sumOfSquares);

        List<String> strings = Arrays.asList("John", "apple", "Jack", "banana", "Jill");
        List<String> modifiedStrings = strings.stream()
                .filter(s -> s.startsWith("J"))
                .map(String::toUpperCase)
                .collect(Collectors.toList());
        System.out.println("Modified strings: " + modifiedStrings);

        List<String> stringList = Arrays.asList("John", "apple", "Jack", "banana", "Jill");
        Set<String> sortedSet = stringList.stream()
                .sorted()
                .collect(Collectors.toSet());
        System.out.println("Sorted set: " + sortedSet);

        List<Human> humans = Arrays.asList(
                new Human("Levani", 14),
                new Human("Nika", 16),
                new Human("Irakli", 17)
        );
        boolean hasLevani = humans.stream()
                .filter(h -> h.getAge() > 15)
                .anyMatch(h -> h.getName().equals("Levani"));
        System.out.println("Has Levani over 15: " + hasLevani);

        List<Integer> numbersList = Arrays.asList(10, 20, 30, 50, 40, 30, 60);
        Optional<Integer> secondHighest = numbersList.stream()
                .distinct()
                .sorted(Comparator.reverseOrder())
                .skip(1)
                .findFirst();
        secondHighest.ifPresent(val -> System.out.println("Second highest: " + val));
    }
}
