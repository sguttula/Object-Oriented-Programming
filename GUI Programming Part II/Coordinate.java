package application;

public class Coordinate {
	private int row, column;
	private char coordinate;
	private final char space = ' ';
	private final char wall = 'W';
	private final char start = 'S';
	private final char exit = 'E';
	private final char fool = 'F';
	private final char bull = 'B';
	public Coordinate (int rowIn, int columnIn, char coordinateIn) {
		row = rowIn;
		column = columnIn;
		coordinate = coordinateIn;;
	} 
	public int getRow() {
		return row;
	} 
	public void setRow(int row) {
		this.row = row;
	}
	public int getColumn() {
		return column;
	}
	public void setColumn(int column) {
		this.column = column;
	}
	public char getCoordinate() {
		return coordinate;
	}
	public void setCoordinate(char coordinate) {
		this.coordinate = coordinate;
	}
	public char getSpace() {
		return space;
	}
	public char getWall() {
		return wall;
	}
	public char getStart() {
		return start;
	}
	public char getExit() {
		return exit;
	}
	public char getFool() {
		return fool;
	}
	public char getBull() {
		return bull;
	}
}
