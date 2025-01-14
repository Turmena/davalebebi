public class Elf extends WorkshopMember implements ChristmasCelebrator {
    private int skillLevel;
    private String elfType;

    public Elf(String name, String nickName, int age, int skillLevel, String elfType) {
        super(name, nickName, age);
        this.skillLevel = skillLevel;
        this.elfType = elfType;
    }

    private void increaseExperience() {
        skillLevel++;
    }

    public void makeToy() {
        System.out.println(getName() + " is making a toy.");
        increaseExperience();
    }

    public void wrapGifts() {
        System.out.println(getName() + " is wrapping gifts.");
        increaseExperience();
    }

    @Override
    public void celebrateChristmas() {
        System.out.println(getName() + " is celebrating Christmas.");
    }

    @Override
    public void hostChristmasParty() {
        System.out.println(getName() + " is hosting a Christmas party.");
    }
}
