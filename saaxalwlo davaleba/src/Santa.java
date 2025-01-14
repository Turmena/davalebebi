import java.util.ArrayList;
import java.util.List;

public class Santa extends WorkshopMember implements ChristmasSpirit {
    private List<Child> childrenList;

    public Santa(String name, String nickName, int age) {
        super(name, nickName, age);
        this.childrenList = new ArrayList<>();
    }

    public void deliverGifts() {
        System.out.println("Santa is delivering gifts.");
    }

    public List<Child> checkNaughtyOrNiceList() {
        List<Child> niceChildren = new ArrayList<>();
        for (Child child : childrenList) {
            if (child.getBehaviorScore() > 5) {
                niceChildren.add(child);
            }
        }
        return niceChildren;
    }

    @Override
    public void spreadJoy() {
        System.out.println("Santa is spreading joy.");
    }

    @Override
    public void singCarols() {
        System.out.println("Santa is singing carols.");
    }

    @Override
    public void decorateTree() {
        System.out.println("Santa is decorating the tree.");
    }
}
