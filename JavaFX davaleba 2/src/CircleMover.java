import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.layout.StackPane;

public class CircleMover {
    private Circle circle;
    private StackPane root;

    public CircleMover(StackPane root) {
        this.root = root;
        createCircle();
    }

    private void createCircle() {
        circle = new Circle(30, Color.BLUE);  // შეიქმნება წრე
        circle.setTranslateX(200);
        circle.setTranslateY(200);
        root.getChildren().add(circle);
    }

    public void moveCircle(double dx, double dy) {
        circle.setTranslateX(circle.getTranslateX() + dx);
        circle.setTranslateY(circle.getTranslateY() + dy);
    }

    public void changeColor() {
        circle.setFill(Color.RED);  // წრე მიიღებს წითელ ფერს
    }
}
