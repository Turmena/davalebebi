import java.util.List;

public class Main {
    public static void main(String[] args) {
        Elf elf1 = new Elf("Elfy", "Speedy", 100, 5, "Toy Maker");
        Elf elf2 = new Elf("Buddy", "Jolly", 120, 8, "Gift Wrapper");

        elf1.makeToy();
        elf1.wrapGifts();
        elf2.makeToy();
        elf2.wrapGifts();

        Reindeer reindeer1 = new Reindeer("Rudolph", "Red Nose", 5, 55, "Red");
        Reindeer reindeer2 = new Reindeer("Dasher", "Fast Flyer", 8, 45, "Brown");

        reindeer1.fly();
        System.out.println(reindeer1.getName() + " fitness level: " + reindeer1.checkFitnessLevel());

        reindeer2.fly();
        System.out.println(reindeer2.getName() + " fitness level: " + reindeer2.checkFitnessLevel());

        Child child1 = new Child("Alice", 8);
        Child child2 = new Child("Bob", 4);

        child1.addWish("Doll");
        child1.addWish("Puzzle");

        child2.addWish("Race Car");

        Santa santa = new Santa("Santa Claus", "Jolly", 1750);
        List<Child> niceChildren = santa.checkNaughtyOrNiceList();

        System.out.println("Nice children:");
        for (Child child : niceChildren) {
            System.out.println("- " + child.getName());
        }

        santa.deliverGifts();

        Snowman snowman = new Snowman(5.0, "Red", false);
        snowman.decorate("Scarf");
        snowman.decorate("Carrot Nose");

        System.out.println("Snowman decorated. Height: " + snowman.getHeight());
        snowman.melt();
        System.out.println("Snowman melted. New height: " + snowman.getHeight());

        snowman.makeMagical();
        System.out.println("Snowman is now magical.");
    }
}
