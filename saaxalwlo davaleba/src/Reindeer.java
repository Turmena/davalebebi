public class Reindeer extends WorkshopMember {
    private int flyingSpeed;
    private String noseColor;

    public Reindeer(String name, String nickName, int age, int flyingSpeed, String noseColor) {
        super(name, nickName, age);
        this.flyingSpeed = flyingSpeed;
        this.noseColor = noseColor;
    }

    public void fly() {
        System.out.println(getName() + " is flying at speed " + flyingSpeed + ".");
    }

    public void trainForChristmas() {
        System.out.println(getName() + " is training for Christmas.");
    }

    public char checkFitnessLevel() {
        if (flyingSpeed > 50 && getAge() < 10) return 'A';
        if (flyingSpeed > 40) return 'B';
        if (flyingSpeed > 30) return 'C';
        return 'F';
    }
}
