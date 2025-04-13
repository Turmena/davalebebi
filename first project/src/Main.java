import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Line;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;

public class Main extends Application {

    @Override
    public void start(Stage primaryStage) {
        TextCreator textCreator = new TextCreator();
        var greetingText = textCreator.createGreetingText();

        Rectangle square = new Rectangle(100, 100, Color.GREEN);
        square.setTranslateY(50);

        Line line1 = new Line(-50, 0, 50, 100);
        line1.setStroke(Color.YELLOW);
        line1.setStrokeWidth(2);
        line1.setTranslateY(50);

        Line line2 = new Line(50, 0, -50, 100);
        line2.setStroke(Color.YELLOW);
        line2.setStrokeWidth(2);
        line2.setTranslateY(50);

        Rectangle rectangle = new Rectangle(200, 150);
        rectangle.setStroke(Color.BLUE);
        rectangle.setFill(Color.TRANSPARENT);
        rectangle.setStrokeWidth(3);
        rectangle.setTranslateY(200);

        StackPane stackPane = new StackPane();
        stackPane.getChildren().addAll(greetingText, square, line1, line2, rectangle);

        Scene scene = new Scene(stackPane, 600, 600, Color.DARKBLUE);
        
        Image icon = new Image("java.png");
        primaryStage.getIcons().add(icon);

        primaryStage.setTitle("JavaFX აპლიკაცია");
        primaryStage.setScene(scene);
        primaryStage.setResizable(false);
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
