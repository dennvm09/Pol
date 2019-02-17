package application;
	
import javafx.application.Application;
import javafx.stage.Stage;
import model.Polynomials;
import javafx.scene.Scene;
import javafx.scene.control.TabPane;
import javafx.scene.layout.Background;
import javafx.scene.layout.BackgroundFill;
import javafx.scene.layout.BorderPane;
import javafx.scene.paint.Color;
import javafx.fxml.FXMLLoader;


public class Main extends Application {
	
	private static Polynomials poly;
	
	public Main() {
		poly = new Polynomials();
	}
	
	public static Polynomials getPolynomials() {
		return poly;
	}
	
	
	
	@Override
	public void start(Stage primaryStage) {
		try {
			TabPane root = (TabPane)FXMLLoader.load(getClass().getResource("Polynomials.fxml"));
			root.setBackground(new Background(new BackgroundFill(Color.WHITE, null, null)));
			Scene scene = new Scene(root);
			scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
			primaryStage.setScene(scene);
			primaryStage.show();
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		launch(args);
	}
}
