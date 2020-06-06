package application;

import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.input.InputEvent;
import javafx.scene.input.MouseEvent;
import javafx.application.Application;
import javafx.event.Event;
import javafx.event.EventHandler;
import javafx.stage.Stage;
import application.Coordinate;
import application.StreetMap;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import application.MazeGUIPane;


public class MazeGUIPane extends BorderPane{
	//public void start(Stage primaryStage) {

	//StreetMap root = new StreetMap();
	//Label[][] labes = new Label[root.getDown()][root.getSide()];
	HBox h = new HBox();
	HBox h1 = new HBox(); 
	Coordinate[][] maps = new Coordinate[20][20];
	GridPane gp = new GridPane();

	Button b = new Button("Run");
	Label top = new Label("Map Of Pamplona");



	public void startGame() {
		maps = new StreetMap().generate();
		createTitle();
		makeGrid();
		createButton();
		setTop(h);
		setCenter(gp);
		setBottom(h1);
	}
	public void makeGrid() {
		gp = new GridPane();
		gp.getStyleClass().add("lines");
		for (int row = 0; row < 25; row++)
			for (int col = 0; col < 25; col++) {
				Label l = new Label(" ");
				makeLabels(l, row, col);
				gp.add(l, col, row);
			}
	}
	public void createTitle() {
		h = new HBox();
		h.getStyleClass().add("title");
		top.getStyleClass().add("text");
		h.getChildren().add(top);
	}
	public void createButton() {
		b = new Button("Run");
		b.getStyleClass().add("button");
		h1.getChildren().add(b);
		h1.getStyleClass().add("footer"); 
	}
	public void makeLabels(final Label l, final int row, final int col) {
		if(row == 0 && col == 1) {
			l.getStyleClass().add("start");
			l.setText("S");
		}
		else if(row == 24 && col == 23) {
			l.getStyleClass().add("exit");
			l.setText("E");
		}
		else if (row == 0 || col == 0 || row == 24 || col == 24) {
			l.getStyleClass().add("wall");
		}
		else {
			l.setMinWidth(20);
			l.setMinHeight(20);
			if(maps[row][col].getCoordinate() == 'W') {
				l.getStyleClass().add("wall");
			}
			else
				l.getStyleClass().add("gridpane");
			b.setOnMouseClicked(new EventHandler<InputEvent>() {
				@Override
				public void handle(InputEvent arg0) {
					boolean clicked = true;
					if(clicked) {
						b.getStyleClass().clear();
						b.getStyleClass().add("gridpane");
					}
				}
			});			
		}
	}
}
	
