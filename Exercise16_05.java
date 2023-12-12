import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.geometry.Pos;
import javafx.scene.input.KeyCode;

public class Exercise_16_05 extends Application {
	protected TextField dec = new TextField();
	protected TextField hex = new TextField();
	protected TextField binary = new TextField();

	@Override 
	public void start(Stage primaryStage) {
		dec.setAlignment(Pos.BOTTOM_RIGHT);
		hex.setAlignment(Pos.BOTTOM_RIGHT);
		binary.setAlignment(Pos.BOTTOM_RIGHT);
		GridPane pane = new GridPane();
		pane.setAlignment(Pos.CENTER);
		pane.add(new Label("Decimal"), 0, 0);
		pane.add(dec, 1, 0);
		pane.add(new Label("Hex"), 0, 1);
		pane.add(hex, 1, 1);
		pane.add(new Label("Binary"), 0, 2);
		pane.add(binary, 1, 2);

		dec.setOnKeyPressed(e -> {
			if (e.getCode() == KeyCode.ENTER) {
				hex.setText(Integer.toHexString(
					Integer.parseInt(dec.getText())));

				binary.setText(Integer.toBinaryString(
					Integer.parseInt(dec.getText())));
			}
		});

		hex.setOnKeyPressed(e -> {
			if (e.getCode() == KeyCode.ENTER) {
				dec.setText(String.valueOf(
					Integer.parseInt(hex.getText(), 16)));

				binary.setText(Integer.toBinaryString(
					Integer.parseInt(hex.getText(), 16)));
			}
		});

		binary.setOnKeyPressed(e -> {
			if (e.getCode() == KeyCode.ENTER) {
				dec.setText(String.valueOf(
					Integer.parseInt(binary.getText(), 2)));

				hex.setText(Integer.toHexString(
					Integer.parseInt(binary.getText(), 2)));
			}
		});
		Scene scene = new Scene(pane, 250, 100);
		primaryStage.setTitle("Number converter"); 
		primaryStage.setScene(scene); 
		primaryStage.show(); 
	}
}