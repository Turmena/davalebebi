import java.util.*;

public class Main {
    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>();
        Random random = new Random();
        while (true) {
            int num = random.nextInt(51);
            numbers.add(num);
            if (num == 40) break;
        }

        System.out.println("List size: " + numbers.size());
        System.out.println(numbers.toString().replace("[", "").replace("]", ""));

        numbers.removeIf(n -> n % 2 == 0);
        System.out.println(numbers.toString().replace("[", "").replace("]", ""));

        prettyPrint(numbers);

        int[] array = new int[5];
        for (int i = 0; i < 5; i++) {
            array[i] = random.nextInt(51);
        }

        List<Integer> arrayList = new ArrayList<>();
        for (int num : array) {
            arrayList.add(num);
        }

        int maxIndex = arrayList.indexOf(Collections.max(arrayList));
        System.out.println("Numbers: " + Arrays.toString(array));
        System.out.println("Max number index: " + maxIndex);

        Library library = new Library();
        library.populateList("src/books.txt");
        library.printBooks();
    }

    public static void prettyPrint(List<Integer> list) {
        System.out.print("List of {");
        for (int i = 0; i < list.size(); i++) {
            System.out.print(list.get(i));
            if (i < list.size() - 1) System.out.print(", ");
        }
        System.out.println("}");
    }
}
