package application;

import java.util.ArrayList;
import java.util.List;

import javax.swing.ImageIcon;
import javax.swing.JLabel;

public class Bulls {
	int i, j, x, y;
	
	public Bulls() {
		JLabel title = new JLabel(" ");
		ImageIcon bull = new ImageIcon("title.gif");
		title.setIcon(bull);
	}
	public int getHmove() {
		return i;
	}
	public int getVmove() {
		return j; 
	}
	public void setHmove(int i) {
		this.i = i;
	}
	public void setVmove(int j) {
		this.j = j;
	}
}
