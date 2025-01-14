import java.util.ArrayList;
import java.util.List;

public class Child {
    private String name;
    private int behaviorScore;
    private List<String> wishList;

    public Child(String name, int behaviorScore) {
        this.name = name;
        this.behaviorScore = behaviorScore;
        this.wishList = new ArrayList<>();
    }

    public void addWish(String wish) {
        wishList.add(wish);
    }

    public int getBehaviorScore() {
        return behaviorScore;
    }

    public String getName() {
        return name;
    }
}
