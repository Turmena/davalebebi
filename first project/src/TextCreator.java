import javafx.scene.text.Font;
import javafx.scene.text.Text;
import javafx.scene.paint.Color;

public class TextCreator {

    public Text createGreetingText() {
        Text text = new Text("გამარჯობა ეს არის აპლიკაცია");
        text.setFont(Font.font(30));
        text.setFill(Color.WHITE);
        text.setTranslateY(-200);
        return text;
    }
}
