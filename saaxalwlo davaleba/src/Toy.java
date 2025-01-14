public class Toy {
    private String type;
    private int difficultyLevel;

    public Toy(String type, int difficultyLevel) {
        this.type = type;
        this.difficultyLevel = difficultyLevel;
    }

    public boolean isChallenging() {
        return difficultyLevel > 7;
    }

    @Override
    public String toString() {
        return "Toy[type=" + type + ", difficultyLevel=" + difficultyLevel + "]";
    }
}
