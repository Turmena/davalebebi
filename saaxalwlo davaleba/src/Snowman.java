import java.util.ArrayList;
import java.util.List;

public class Snowman {
    private double height;
    private String hatColor;
    private boolean isMagical;
    private List<String> accessories;

    public Snowman(double height, String hatColor, boolean isMagical) {
        this.height = height;
        this.hatColor = hatColor;
        this.isMagical = isMagical;
        this.accessories = new ArrayList<>();
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public String getHatColor() {
        return hatColor;
    }

    public void setHatColor(String hatColor) {
        this.hatColor = hatColor;
    }

    public boolean isMagical() {
        return isMagical;
    }

    public void setMagical(boolean magical) {
        isMagical = magical;
    }

    public List<String> getAccessories() {
        return accessories;
    }

    public void decorate(String accessory) {
        accessories.add(accessory);
    }

    public void melt() {
        if (height > 0) {
            height /= 2;
            if (height < 1) {
                height = 0;
            }
        }
    }

    public void makeMagical() {
        isMagical = true;
    }

    @Override
    public String toString() {
        return "Snowman{" +
                "height=" + height +
                ", hatColor='" + hatColor + '\'' +
                ", isMagical=" + isMagical +
                ", accessories=" + accessories +
                '}';
    }

    @Override
    public int hashCode() {
        return hatColor.hashCode() + Double.hashCode(height);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Snowman snowman = (Snowman) obj;
        return Double.compare(snowman.height, height) == 0 &&
                isMagical == snowman.isMagical &&
                hatColor.equals(snowman.hatColor);
    }
}
