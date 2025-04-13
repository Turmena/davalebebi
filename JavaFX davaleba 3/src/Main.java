import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.*;
import javafx.scene.paint.Color;
import javafx.geometry.Pos;
import javafx.scene.control.Alert.AlertType;

public class Main extends Application {

    private int clickCount = 0;

    @Override
    public void start(Stage primaryStage) {
        VBox root = new VBox(20);
        root.setAlignment(Pos.CENTER);

        Button clickMeButton = new Button("Click Me");

        primaryStage.setOnCloseRequest(e -> {
            e.consume();
        });

        clickMeButton.setOnAction(e -> {
            clickCount++;
            if (clickCount == 5) {
                Alert alert = new Alert(AlertType.CONFIRMATION);
                alert.setTitle("Exit Confirmation");
                alert.setHeaderText("Do you really want to exit?");
                alert.setContentText("Press OK to close the app.");

                ButtonType result = alert.showAndWait().orElse(ButtonType.CANCEL);
                if (result == ButtonType.OK) {
                    System.exit(0);
                } else {
                    clickCount = 0;
                }
            }
        });

        Button switchToScenes = new Button("Go to Scene Switcher");
        switchToScenes.setOnAction(e -> {
            primaryStage.setScene(getSceneSwitcher(primaryStage));
        });

        root.getChildren().addAll(clickMeButton, switchToScenes);
        Scene mainScene = new Scene(root, 400, 300);
        primaryStage.setTitle("Alert & Scene Switcher");
        primaryStage.setScene(mainScene);
        primaryStage.show();
    }

    private Scene getSceneSwitcher(Stage stage) {
        VBox root = new VBox(20);
        root.setAlignment(Pos.CENTER);

        Label label = new Label("Scene 1");

        Button yellowBtn = new Button("Switch to Yellow Scene");
        Button redBtn = new Button("Switch to Red Scene");
        Button greenBtn = new Button("Switch to Green Scene");

        yellowBtn.setOnAction(e -> stage.setScene(coloredScene(stage, Color.YELLOW)));
        redBtn.setOnAction(e -> stage.setScene(coloredScene(stage, Color.RED)));
        greenBtn.setOnAction(e -> stage.setScene(coloredScene(stage, Color.GREEN)));

        root.getChildren().addAll(label, yellowBtn, redBtn, greenBtn);
        return new Scene(root, 400, 300);
    }

    private Scene coloredScene(Stage stage, Color color) {
        BorderPane pane = new BorderPane();
        pane.setStyle("-fx-background-color: " + toRgbCode(color));

        Button backButton = new Button("Go Back");
        backButton.setOnAction(e -> stage.setScene(getSceneSwitcher(stage)));

        pane.setCenter(backButton);
        BorderPane.setAlignment(backButton, Pos.CENTER);

        return new Scene(pane, 400, 300);
    }

    private String toRgbCode(Color color) {
        return String.format("rgb(%d, %d, %d)",
                (int)(color.getRed()*255),
                (int)(color.getGreen()*255),
                (int)(color.getBlue()*255));
    }

    public static void main(String[] args) {
        launch(args);
    }
}
