import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.geometry.Pos;
import javafx.scene.control.Button;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Pane;
import javafx.scene.layout.BorderPane;
import javafx.scene.text.Text;
import javafx.scene.control.RadioButton;
import javafx.scene.control.ToggleGroup;
import javafx.scene.paint.Color;

public class Exercise16_01 extends Application {
	protected Text text = new Text(50, 50, "Programming is fun");

	@Override 
	public void start(Stage primaryStage) {
		HBox paneForButtons = new HBox(20);
		Button leftButton = new Button("<=");
		Button rightButton = new Button("=>");
		paneForButtons.getChildren().addAll(leftButton, rightButton);
		paneForButtons.setAlignment(Pos.CENTER);
		BorderPane pane = new BorderPane();
		pane.setBottom(paneForButtons);

		HBox radioButtons = new HBox(20);
		RadioButton redRButton = new RadioButton("Red");
		RadioButton yellowRButton = new RadioButton("Yellow");
		RadioButton blackRButton = new RadioButton("Black");
		RadioButton orangeRButton = new RadioButton("Orange");
		RadioButton greenRButton = new RadioButton("Green");
		radioButtons.getChildren().addAll(redRButton, yellowRButton, 
			blackRButton, orangeRButton, greenRButton);

		ToggleGroup group = new ToggleGroup();
		redRButton.setToggleGroup(group);
		yellowRButton.setToggleGroup(group);
		blackRButton.setToggleGroup(group);
		orangeRButton.setToggleGroup(group);
		greenRButton.setToggleGroup(group);

		Pane paneForText = new Pane();
		paneForText.getChildren().add(text);
		pane.setCenter(paneForText);
		pane.setTop(radioButtons);

		leftButton.setOnAction(e -> text.setX(text.getX() - 5));
		rightButton.setOnAction(e -> text.setX(text.getX() + 5));

		redRButton.setOnAction(e -> {
			if (redRButton.isSelected()) {
				text.setFill(Color.RED);
			}
		});

		yellowRButton.setOnAction(e -> {
			if (yellowRButton.isSelected()) {
				text.setFill(Color.YELLOW);
			}
		});

		blackRButton.setOnAction(e -> {
			if (blackRButton.isSelected()) {
				text.setFill(Color.BLACK);
			}
		});

		orangeRButton.setOnAction(e -> {
			if (orangeRButton.isSelected()) {
				text.setFill(Color.ORANGE);
			}
		});

		greenRButton.setOnAction(e -> {
			if (greenRButton.isSelected()) {
				text.setFill(Color.GREEN);
			}
		});
		Scene scene = new Scene(pane, 450, 150);
		primaryStage.setTitle("RadioButtonExercise"); 
		primaryStage.setScene(scene); 
		primaryStage.show(); 
	}
}