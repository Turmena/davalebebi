import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import java.util.Random;

public class ButtonHandler {
    private CircleMover circleMover;
    private Button upButton;
    private Button downButton;
    private Button leftButton;
    private Button rightButton;
    private Button diagonalUpRightButton;
    private Button diagonalUpLeftButton;
    private Button diagonalDownRightButton;
    private Button diagonalDownLeftButton;
    private Button colorButton;
    private Button randomButton;

    public ButtonHandler(CircleMover circleMover) {
        this.circleMover = circleMover;
        createButtons();
        setButtonActions();
    }

    private void createButtons() {
        upButton = new Button("Up");
        downButton = new Button("Down");
        leftButton = new Button("Left");
        rightButton = new Button("Right");
        diagonalUpRightButton = new Button("Up Right");
        diagonalUpLeftButton = new Button("Up Left");
        diagonalDownRightButton = new Button("Down Right");
        diagonalDownLeftButton = new Button("Down Left");
        colorButton = new Button("Change Color");
        randomButton = new Button("Click me");

        upButton.setTranslateY(-100);
        downButton.setTranslateY(100);
        leftButton.setTranslateX(-100);
        rightButton.setTranslateX(100);
        diagonalUpRightButton.setTranslateX(50);
        diagonalUpRightButton.setTranslateY(-50);
        diagonalUpLeftButton.setTranslateX(-50);
        diagonalUpLeftButton.setTranslateY(-50);
        diagonalDownRightButton.setTranslateX(50);
        diagonalDownRightButton.setTranslateY(50);
        diagonalDownLeftButton.setTranslateX(-50);
        diagonalDownLeftButton.setTranslateY(50);
        colorButton.setTranslateY(150);
        randomButton.setTranslateY(200);
    }

    private void setButtonActions() {
        upButton.setOnAction(e -> circleMover.moveCircle(0, -10));
        downButton.setOnAction(e -> circleMover.moveCircle(0, 10));
        leftButton.setOnAction(e -> circleMover.moveCircle(-10, 0));
        rightButton.setOnAction(e -> circleMover.moveCircle(10, 0));
        diagonalUpRightButton.setOnAction(e -> circleMover.moveCircle(10, -10));
        diagonalUpLeftButton.setOnAction(e -> circleMover.moveCircle(-10, -10));
        diagonalDownRightButton.setOnAction(e -> circleMover.moveCircle(10, 10));
        diagonalDownLeftButton.setOnAction(e -> circleMover.moveCircle(-10, 10));
        colorButton.setOnAction(e -> circleMover.changeColor());
        randomButton.setOnAction(e -> randomMove(randomButton));
    }

    private void randomMove(Button randomButton) {
        Random rand = new Random();
        double randomX = rand.nextInt(300);
        double randomY = rand.nextInt(300);

        // ეკრანის საზღვრებში გადატანა
        if (randomX > 400) randomX = 400;
        if (randomY > 400) randomY = 400;

        randomButton.setTranslateX(randomX);
        randomButton.setTranslateY(randomY);
    }

    public Button getUpButton() {
        return upButton;
    }

    public Button getDownButton() {
        return downButton;
    }

    public Button getLeftButton() {
        return leftButton;
    }

    public Button getRightButton() {
        return rightButton;
    }

    public Button getDiagonalUpRightButton() {
        return diagonalUpRightButton;
    }

    public Button getDiagonalUpLeftButton() {
        return diagonalUpLeftButton;
    }

    public Button getDiagonalDownRightButton() {
        return diagonalDownRightButton;
    }

    public Button getDiagonalDownLeftButton() {
        return diagonalDownLeftButton;
    }

    public Button getColorButton() {
        return colorButton;
    }

    public Button getRandomButton() {
        return randomButton;
    }
}
