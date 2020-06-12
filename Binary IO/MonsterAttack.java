package lab4;
import java.io.Serializable;

import lab4.BinaryMonsterPersister;
import lab4.MonsterPersister;
public class MonsterAttack implements Serializable{
	private int attackId;
	String date;
	private int month;
	private int day; 
	private int year;
	private String monsterName;
	private String locationOfAttack;
	private int numberOfVictims;
	public MonsterAttack (int attackIdIn, String dateIn, String monsterNameIn, String locationOfAttackIn, int numberOfVictimsIn) {
		attackId = attackIdIn;
		date = dateIn;
		String[] dateFormat = date.split("/");
		month = Integer.parseInt(dateFormat[0]);
		day = Integer.parseInt(dateFormat[1]);
		year = Integer.parseInt(dateFormat[2]);
		monsterName = monsterNameIn;
		locationOfAttack = locationOfAttackIn;
		numberOfVictims = numberOfVictimsIn;
	}
	public int getAttackId() {
		return attackId;
	}
	public void setAttackId(int attackId) {
		this.attackId = attackId;
	}
	public int getMonth() {
		return month;
	}
	public void setMonth(int month) {
		this.month = month;
	}
	public int getDay() {
		return day;
	}
	public void setDay(int day) {
		this.day = day;
	}
	public int getYear() {
		return year;
	}
	public void setYear(int year) {
		this.year = year;
	}
	public String getMonsterName() {
		return monsterName;
	}
	public void setMonsterName(String monsterName) {
		this.monsterName = monsterName;
	}
	public String getLocationOfAttack() {
		return locationOfAttack;
	}
	public void setLocationOfAttack(String locationOfAttack) {
		this.locationOfAttack = locationOfAttack;
	}
	public int getNumberOfVictims() {
		return numberOfVictims;
	}
	public void setNumberOfVictims(int numberOfVictims) {
		this.numberOfVictims = numberOfVictims;
	}
	public String toString() {
		return "Attack # " + attackId + " occured on " + date + ". "
				+ monsterName + " attacked " + locationOfAttack + ", "
				+ "resulting in " + numberOfVictims + " tragic fatalities.";
	}
	public String getDate() {
		return date;
	}
	public void setDate(String date) {
		this.date = date;
	}
}
