package application;	

import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.FlowPane;
import javafx.event.EventHandler;
import javafx.event.Event;
import javafx.scene.control.Button;
import javafx.event.ActionEvent;
import javafx.scene.layout.VBox;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Pane;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.GridPane;
import javafx.scene.control.Label;

public class Hello extends Application {

	@Override
	public void start(Stage primaryStage) {
		BorderPane s = new BorderPane();

		Scene scene = new Scene(s);

		s.getStylesheets().add("styles/application.css");

		HBox one = new HBox();
		one.getStyleClass().add("hbox1");

		Label l = new Label("Reverse Multiplication Table");		
		one.getChildren().add(l);

		GridPane gp = new GridPane();

		for (int rowCounter = 0; rowCounter < 11; rowCounter++) {
			for (int colCounter = 0; colCounter < 11; colCounter++) {
				if (rowCounter == 0) {
					String colNum = String.valueOf(colCounter);
					Label grids = new Label(colNum);
					grids.setMinWidth(75);
					grids.setMinHeight(50);
					grids.getStyleClass().add("columns");
					gp.add(grids, colCounter, rowCounter);
				}
				else if (colCounter == 0) {
					String rowNum = String.valueOf(rowCounter);
					Label grids2 = new Label(rowNum);
					grids2.setMinWidth(75);
					grids2.setMinHeight(50);
					grids2.getStyleClass().add("columns");
					gp.add(grids2, colCounter, rowCounter);
				}
				else {
					String number = rowCounter + " * " + colCounter;
					Label label = new Label(number);
					label.setMinWidth(75);
					label.setMinHeight(50);
					label.getStyleClass().add("gridpane");
					gp.add(label, colCounter, rowCounter);
				}
			}
		}

		HBox two = new HBox();
		two.getStyleClass().add("hbox2");

		Label newL = new Label("Enter Answer:  ");
		two.getChildren().add(newL);

		TextField input = new TextField();
		two.getChildren().add(input);

		int value = Integer.parseInt("42");

		Button b = new Button("Find Problems");
		two.getChildren().add(b);

		b.addEventHandler(MouseEvent.MOUSE_CLICKED, new EventHandler<Event>(){
			@Override
			public void handle(Event event) {
				for(int i = 0 ; i < 11 ; i++) {
					for(int j = 0 ; j < 11 ; j++) {
						if(value == (i * j) && value == (j * i)) {
							input.getStyleClass().add("textfield");
							//gp.getChildren().add(b);
						}
					}
				}
			}
		});

		primaryStage.setTitle("                            "
				+ "                                        "
				+ "                                        "
				+ "               Lab 8");
		s.setTop(one);
		s.setCenter(two);
		s.setBottom(gp);
		primaryStage.setScene(scene);
		primaryStage.show();		
	}

	public static void main(String[] args) {
		launch(args);
	}
}
