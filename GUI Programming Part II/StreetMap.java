package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import javafx.scene.control.Label;

public class StreetMap { 
	Coordinate[][] street;
	private int down = 25;
	private int side = 25;
	private List<Bulls> bulls = new ArrayList<Bulls>();
	public StreetMap() {
		street = new Coordinate[down][side];
		generate();
	}
	public Coordinate[][] generate() {
		Random gen = new Random();
		for(int i = 0 ; i < down ; i++) {
			for(int j = 0 ; j < side ; j++) {
				if(i == 0 && j == 1) {
					street[i][j] = new Coordinate(i, j , 'S');
				}
				else if(i == 24 && j == 23) {
					street[i][j] = new Coordinate(i, j , 'E');
				}
				else if (i == 0 || j == 0 || i == 24 || j == 24) {
					street[i][j] = new Coordinate(i, j , 'W');
				}
				else {
					
					int percent = gen.nextInt(100 - 1 + 1) + 1;
					if(percent <= 30) {
						street[i][j] = new Coordinate(i, j , 'W');
					}
					else
					 {
						street[i][j] = new Coordinate(i, j , ' ');
					}
				}
			}
		}
		return street;
	}
}
