package gui;
	
import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.control.TabPane;
import javafx.fxml.FXMLLoader;

/*
 * 
 * 1. Run Desktop Prototype
 * mvn exec:java
 * 
 * 2. Run Web Prototype
 * mvn jpro:run 
 * mvn jpro:stop
 *
 * 3. Run Test Script
 * mvn test
 *
 */
public class Main extends Application {
	@Override
	public void start(Stage primaryStage) {
		try {
			TabPane root = (TabPane) FXMLLoader.load(getClass().getResource("Prototype.fxml"));
			Scene scene = new Scene(root);
			scene.getStylesheets().add(getClass().getResource("Prototype.css").toExternalForm());
			primaryStage.setScene(scene);
			primaryStage.setMaximized(true);
			primaryStage.setTitle("Prototype GROUP2");
			primaryStage.show();
			
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		launch(args);
	}
}
	
