import javafx.fxml.FXML;
import javafx.scene.layout.AnchorPane;
import javafx.scene.control.Button;

import java.util.Random;

public class Controller {

    @FXML
    private AnchorPane root;

    @FXML
    private Button changeBackgroundColorButton;

    @FXML
    public void changeBackgroundColor() {
        Random random = new Random();
        int red = random.nextInt(256);
        int green = random.nextInt(256);
        int blue = random.nextInt(256);

        root.setStyle("-fx-background-color: rgb(" + red + "," + green + "," + blue + ");");
    }
}
