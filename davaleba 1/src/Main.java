public class Main {
    public static void main(String[] args) {
        Writer writer1 = new Writer("George", "Orwell");
        Writer writer2 = new Writer("J.K.", "Rowling");

        Book[] books = {
                new Book("1984", 328, "Dystopian", writer1),
                new Book("Animal Farm", 112, "Political Fiction", writer1),
                new Book("Harry Potter", 500, "Fantasy", writer2)
        };

        System.out.println("Books:");
        for (Book book : books) {
            System.out.println(book);
        }

        Fraction[] fractions = {
                new Fraction(1, 2),
                new Fraction(2, 4),
                new Fraction(3, 5),
                new Fraction(6, 10),
                new Fraction(1, 3)
        };

        System.out.println("\nFractions:");
        for (Fraction fraction : fractions) {
            System.out.println(fraction);
        }

        int equalFractions = 0;
        for (int i = 0; i < fractions.length; i++) {
            for (int j = i + 1; j < fractions.length; j++) {
                if (fractions[i].equals(fractions[j])) {
                    equalFractions++;
                }
            }
        }
        System.out.println("Equal fractions count: " + equalFractions);

        QuadraticEquation[] equations = {
                new QuadraticEquation(1, -3, 2),
                new QuadraticEquation(1, -2, 1),
                new QuadraticEquation(2, -4, 2),
                new QuadraticEquation(1, 0, -1),
                new QuadraticEquation(1, 1, 1)
        };

        System.out.println("\nQuadratic Equations:");
        for (QuadraticEquation equation : equations) {
            System.out.println(equation);
        }

        int equalEquations = 0;
        for (int i = 0; i < equations.length; i++) {
            for (int j = i + 1; j < equations.length; j++) {
                if (equations[i].equals(equations[j])) {
                    equalEquations++;
                }
            }
        }
        System.out.println("Equal quadratic equations count: " + equalEquations);
    }
}
