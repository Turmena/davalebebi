import java.util.Comparator;

public class BasketballPlayer implements Comparable<BasketballPlayer> {
    private String firstName;
    private String lastName;
    private int points, rebounds, blocks, assists, turnovers;

    public BasketballPlayer(String firstName, String lastName, int points, int rebounds, int blocks, int assists, int turnovers) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.points = points;
        this.rebounds = rebounds;
        this.blocks = blocks;
        this.assists = assists;
        this.turnovers = turnovers;
    }

    public double getRating() {
        return points * 1.0 + rebounds * 1.0 + blocks * 2.0 + assists * 1.5 + turnovers * (-2.0);
    }

    @Override
    public int compareTo(BasketballPlayer o) {
        return Double.compare(o.getRating(), this.getRating());
    }

    @Override
    public String toString() {
        return firstName + " " + lastName + " | Rating: " + getRating();
    }
}

class BasketballPlayerAscending implements Comparator<BasketballPlayer> {
    @Override
    public int compare(BasketballPlayer o1, BasketballPlayer o2) {
        return Double.compare(o1.getRating(), o2.getRating());
    }
}
