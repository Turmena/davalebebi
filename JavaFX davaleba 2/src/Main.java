import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

public class Main extends Application {

    @Override
    public void start(Stage primaryStage) {
        StackPane root = new StackPane();

        CircleMover circleMover = new CircleMover(root);
        ButtonHandler buttonHandler = new ButtonHandler(circleMover);

        root.getChildren().addAll(buttonHandler.getUpButton(),
                buttonHandler.getDownButton(),
                buttonHandler.getLeftButton(),
                buttonHandler.getRightButton(),
                buttonHandler.getDiagonalUpRightButton(),
                buttonHandler.getDiagonalUpLeftButton(),
                buttonHandler.getDiagonalDownRightButton(),
                buttonHandler.getDiagonalDownLeftButton(),
                buttonHandler.getColorButton(),
                buttonHandler.getRandomButton());

        Scene scene = new Scene(root, 600, 600);
        primaryStage.setTitle("JavaFX Circle and Buttons");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
