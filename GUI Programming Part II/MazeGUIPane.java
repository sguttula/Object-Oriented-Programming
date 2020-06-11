package application;

import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.input.InputEvent;
import javafx.scene.input.KeyCode;
import javafx.scene.input.MouseEvent;
import javafx.application.Application;
import javafx.event.Event;
import javafx.event.EventHandler;
import javafx.stage.Stage;

import javafx.scene.input.KeyEvent;

import application.Coordinate;
import application.StreetMap;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import application.MazeGUIPane;


public class MazeGUIPane extends BorderPane{

	HBox h = new HBox();
	HBox h1 = new HBox(); 
	Coordinate[][] maps = new Coordinate[20][20];
	GridPane gp = new GridPane();
	Label top = new Label("Map Of Pamplona");
	Label[][] labe;


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
		h1 = new HBox();
		gp = new GridPane();
		gp.getStyleClass().add("lines");
		labe = new Label[25][25];
		for (int row = 0; row < 25; row++)
			for (int col = 0; col < 25; col++) {
				Label l = new Label(" ");
				labe[row][col] = l;
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
		Button b = new Button("Run");
		b.getStyleClass().add("button");
		h1.getChildren().add(b);
		h1.getStyleClass().add("footer");
		b.addEventHandler(MouseEvent.MOUSE_CLICKED, new EventHandler<Event>() {
			@Override
			public void handle(Event event) {				
				startGame();
				gameBegins();
			}
		});
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
			l.setOnMouseClicked(new EventHandler<InputEvent>() {
				@Override
				public void handle(InputEvent arg0) {
					if(maps[row][col].getCoordinate() == ' ') {
						l.getStyleClass().clear();
						l.getStyleClass().add("wall");
						maps[row][col].setCoordinate('W');
					}
					else if(maps[row][col].getCoordinate() == 'W') {
						l.getStyleClass().clear();
						l.getStyleClass().add("gridpane");
						maps[row][col].setCoordinate(' ');
					}
					else 
						l.getStyleClass().add("gridpane");
				}
			});				
		}
	}
	public void gameBegins() {
		//makeGrid();
		int takes = 0;
		boolean go = false;
		labe[1][1].getStyleClass().clear();
		labe[1][1].getStyleClass().add("player");
		Coordinate fool = new Coordinate(1, 1, 'F');
		fool.setColumn(1);
		fool.setRow(1);

		setOnKeyPressed(new EventHandler<KeyEvent>() {

			@Override 
			public void handle(final KeyEvent event) {
				if(event.getCode() == KeyCode.UP && maps[fool.getRow() - 1][fool.getColumn()].getCoordinate() != 'W') {
					labe[fool.getRow()][fool.getColumn()].getStyleClass().clear();
					labe[fool.getRow()][fool.getColumn()].getStyleClass().add("gridpane");
					labe[fool.getRow() - 1][fool.getColumn()].getStyleClass().clear();
					labe[fool.getRow() - 1][fool.getColumn()].getStyleClass().add("player1");
					maps[fool.getRow()][fool.getColumn()].setCoordinate(' ');
					maps[fool.getRow() - 1][fool.getColumn()].setCoordinate('F');
					fool.setRow(fool.getRow() - 1);
					fool.setColumn(fool.getColumn());
				}
				else if(event.getCode() == KeyCode.DOWN && maps[fool.getRow() + 1][fool.getColumn()].getCoordinate() != 'W') {
					labe[fool.getRow()][fool.getColumn()].getStyleClass().clear();
					labe[fool.getRow()][fool.getColumn()].getStyleClass().add("gridpane");
					labe[fool.getRow() + 1][fool.getColumn()].getStyleClass().clear();
					labe[fool.getRow() + 1][fool.getColumn()].getStyleClass().add("player1");
					maps[fool.getRow()][fool.getColumn()].setCoordinate(' ');
					maps[fool.getRow() + 1][fool.getColumn()].setCoordinate('F');
					fool.setRow(fool.getRow() + 1);
					fool.setColumn(fool.getColumn());
				}
				else if(event.getCode() == KeyCode.LEFT && maps[fool.getRow()][fool.getColumn() - 1].getCoordinate() != 'W') {
					labe[fool.getRow()][fool.getColumn()].getStyleClass().clear();
					labe[fool.getRow()][fool.getColumn()].getStyleClass().add("gridpane");
					labe[fool.getRow()][fool.getColumn() - 1].getStyleClass().clear();
					labe[fool.getRow()][fool.getColumn() - 1].getStyleClass().add("player1");
					maps[fool.getRow()][fool.getColumn()].setCoordinate(' ');
					maps[fool.getRow()][fool.getColumn() - 1].setCoordinate('F');
					fool.setRow(fool.getRow());
					fool.setColumn(fool.getColumn() - 1);
				}
				else if(event.getCode() == KeyCode.RIGHT && maps[fool.getRow()][fool.getColumn() + 1].getCoordinate() != 'W') {
					labe[fool.getRow()][fool.getColumn()].getStyleClass().clear();
					labe[fool.getRow()][fool.getColumn()].getStyleClass().add("gridpane");
					labe[fool.getRow()][fool.getColumn() + 1].getStyleClass().clear();
					labe[fool.getRow()][fool.getColumn() + 1].getStyleClass().add("player1");
					maps[fool.getRow()][fool.getColumn()].setCoordinate(' ');
					maps[fool.getRow()][fool.getColumn() + 1].setCoordinate('F');
					fool.setRow(fool.getRow());
					fool.setColumn(fool.getColumn() + 1);
				}
			}
			/*setOnKeyPressed(new EventHandler<KeyEvent>() {
			@Override
			public void handle(final KeyEvent keyEvent) {
				if(keyEvent.getCode() = KeyCode.UP) {

				}
			}
		})*/

		});
	}
}

