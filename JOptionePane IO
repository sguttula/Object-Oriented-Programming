package lab4;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import javax.swing.JOptionPane;
import java.io.IOException;
import java.io.*;
public class AttackMonitor {
	private static List<MonsterAttack> monsterAttacks = new ArrayList<MonsterAttack>();
	public void monitor() {
		String[] choices = { "Choose an attack", "Show current attacks", "Delete an attack", "Quit", "Save as a CSV File", "Open as a CSV File"};
		int choice;
		do{
			choice = JOptionPane.showOptionDialog(null, "Main Menu", "Main Menu", 0, JOptionPane.QUESTION_MESSAGE, null, choices, "null");
			switch (choice){
			case 0:
				if(!(monsterAttacks.isEmpty()));
				chooseAttack();
				break;
			case 1: 
				if(!(monsterAttacks.isEmpty()));
				showAttacks();
				
				break;			
			case 2:
				if(!(monsterAttacks.isEmpty()));
				deleteAttack();
				break;
			case 3:
				break;
			case 4:
				if(!(monsterAttacks.isEmpty()));
				try {
					copyFile();
				} catch (IOException q) {
					q.printStackTrace();
				}
				break;
			case 5:
				if(!(monsterAttacks.isEmpty()));
				try {
					readFile();
				} catch (IOException w) {
					w.printStackTrace();
				}
				break;
			}
		}while(choice != 3);
	}
	private void chooseAttack() {
		int id = Integer.parseInt(JOptionPane.showInputDialog("Enter the ID")); //attackId
		String name = JOptionPane.showInputDialog("Enter monster's name"); //monsterName
		String location = JOptionPane.showInputDialog("Enter location"); //locationOfAttack
		int number = Integer.parseInt(JOptionPane.showInputDialog("Enter number of victims")); //numberOfVictims
		String dateOfAttack = JOptionPane.showInputDialog("Enter date of attack"); //date
		monsterAttacks.add(new MonsterAttack(id, dateOfAttack, name, location, number));
	}
	private void showAttacks() {
		StringBuilder in = new StringBuilder("Attacks: \n");
		if (monsterAttacks.isEmpty()) {
			in.append("None.");
		}
		else {
			for (MonsterAttack x: monsterAttacks) {
				in.append(x + "\n");
			}
		}
		JOptionPane.showMessageDialog(null, in);
	}
	private void deleteAttack() {
		StringBuilder in = new StringBuilder("Attacks: \n");
		if (monsterAttacks.isEmpty()) {
			in.append("None.");
			JOptionPane.showMessageDialog(null, in);
		}
		else {
			for (MonsterAttack x: monsterAttacks) {
				in.append(x + "\n");
			}
			int removeId = Integer.parseInt(JOptionPane.showInputDialog(null, in, "Enter the attack ID you wish to delete: "));
			boolean delete = false;
			for(int i = 0 ; i < monsterAttacks.size() ; i++) {
				if (monsterAttacks.get(i).getAttackId() == removeId) {
					monsterAttacks.remove(i);
					JOptionPane.showMessageDialog(null, "The attack is now deleted.");
					delete = true;
				}			
			}
			if(!delete) {
				JOptionPane.showMessageDialog(null, "The attack ID is not found.");
			}
		}
	}
	public static void copyFile() throws IOException {
		File output = new File(JOptionPane.showInputDialog("Enter a filepath to create."));
		{
		BufferedWriter copy = new BufferedWriter(new FileWriter(output));
		for(MonsterAttack q : monsterAttacks) {
			copy.write(q.getAttackId() + "," + q.getMonth() + "/" + q.getDay() + "/" + q.getYear()
			+ "," + q.getMonsterName() + "," + q.getLocationOfAttack() + "," + q.getNumberOfVictims());
			copy.newLine();
		}
		copy.close();
		}
	}
	public static void readFile() throws IOException {
		String openFile = JOptionPane.showInputDialog("Enter the file destination you want to open: ");
		File fileDestination = new File(openFile);
		Scanner freader = new Scanner(fileDestination);
		if(monsterAttacks.isEmpty()) {
			int id;
			String dateOfAttack;
			String name;
			String location;
			int number;
			String line;
			String[] fields;
			while(freader.hasNextLine()) {
				line = freader.nextLine();
				fields = line.split(",");
				id = Integer.parseInt(fields[0]);
				dateOfAttack = fields[1];
				name = fields[2];
				location = fields[3];
				number = Integer.parseInt(fields[4]);
				monsterAttacks.add(new MonsterAttack(id, dateOfAttack, name, location, number));
			}
			freader.close();
		}
		else {
			monsterAttacks.clear();
			int id;
			String dateOfAttack;
			String name;
			String location;
			int number;
			String line;
			String[] fields;
			while(freader.hasNextLine()) {
				line = freader.nextLine();
				fields = line.split(",");
				id = Integer.parseInt(fields[0]);
				dateOfAttack = fields[1];
				name = fields[2];
				location = fields[3];
				number = Integer.parseInt(fields[4]);
				monsterAttacks.add(new MonsterAttack(id, dateOfAttack, name, location, number));
			}
			freader.close();
		}
	}
}




