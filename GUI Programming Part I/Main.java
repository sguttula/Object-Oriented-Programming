package application;

import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.application.Application;
import javafx.stage.Stage;
import application.StreetMap;
import application.Coordinate;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import application.MazeGUIPane; 


public class Main extends Application {
	@Override
	public void start(Stage primaryStage) {	
			MazeGUIPane root1  = new MazeGUIPane();
			Scene scene = new Scene(root1, 500, 560);
			scene.getStylesheets().add("application/application.css");
			primaryStage.setTitle("Lab 9");
			primaryStage.setScene(scene);
			primaryStage.show();
			root1.startGame();
		
	}

	public static void main(String[] args) {
		launch(args);
	}
}
