import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        ArrayList<BasketballPlayer> players = new ArrayList<>();
        players.add(new BasketballPlayer("LeBron", "James", 25, 7, 2, 8, 3));
        players.add(new BasketballPlayer("Michael", "Jordan", 30, 6, 3, 7, 2));
        players.add(new BasketballPlayer("Stephen", "Curry", 28, 5, 1, 10, 4));

        System.out.println("Basketball Players (Descending):");
        Collections.sort(players);
        players.forEach(System.out::println);

        System.out.println("\nBasketball Players (Ascending):");
        players.sort(new BasketballPlayerAscending());
        players.forEach(System.out::println);

        ArrayList<Student> students = new ArrayList<>();
        students.add(new Student("John", "Changela", new Date(100, 5, 15), new ArrayList<>(List.of(90, 85, 88))));
        students.add(new Student("Alice", "Ronaldo", new Date(101, 3, 20), new ArrayList<>(List.of(92, 89, 95))));
        students.add(new Student("Boby", "Messi", new Date(99, 8, 10), new ArrayList<>(List.of(85, 80, 78))));

        System.out.println("\nStudents (Unsorted):");
        students.forEach(System.out::println);

        System.out.println("\nStudents (Lexicographically Sorted):");
        Collections.sort(students);
        students.forEach(System.out::println);

        System.out.println("\nStudents (Sorted by Average Grade):");
        students.sort(new StudentByAverage());
        students.forEach(System.out::println);

        System.out.println("\nStudents (Sorted by Birthdate):");
        students.sort(new StudentByBirthDate());
        students.forEach(System.out::println);

        ArrayList<Car> cars = new ArrayList<>();
        cars.add(new Car("Toyota", "Camry", 2018, 50000, new Engine("Petrol", 4, 2.5)));
        cars.add(new Car("BMW", "M5", 2020, 30000, new Engine("Diesel", 6, 3.0)));
        cars.add(new Car("Mercedes", "C-Class", 2015, 70000, new Engine("Petrol", 4, 2.0)));

        System.out.println("\nCars (Unsorted):");
        cars.forEach(System.out::println);

        System.out.println("\nCars (Sorted by Year):");
        cars.sort(new CarByYear());
        cars.forEach(System.out::println);

        System.out.println("\nCars (Sorted by Mileage):");
        cars.sort(new CarByMileage());
        cars.forEach(System.out::println);

        System.out.println("\nCars (Sorted by Engine Volume):");
        cars.sort(new CarByEngineVolume());
        cars.forEach(System.out::println);
    }
}
