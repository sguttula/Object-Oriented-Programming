import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
public class Lab2 {
	static Scanner in = new Scanner(System.in);
	public static void main(String[] args) {
		int option;
		do{
			List<String> reference = getNumber();
			System.out.println();
			System.out.println("1. Hard Problem");
			System.out.println("2. Easy Problem");
			System.out.println("3. Quit");
			System.out.print("Select one of the following: ");
			option = in.nextInt();
			if(option > 3) {
				System.out.println();
				System.out.print("Wrong number entered.");
				System.out.println();
			}
			switch(option) {
			case 1: hardProblem(reference);
			break;
			case 2: easyProblem(reference);
			break;
			}
		} while (option != 3);
	}
	public static List<String> getNumber(){
		ArrayList<String> namesOfKids = new ArrayList<String>();
		System.out.print("Enter the number of kids: ");
		int number = in.nextInt();
		for(int i = 0 ; i < number ; i++) {
			namesOfKids.add(in.next());
		}
		return namesOfKids;
	}
	public static int hardProblem(List<String> getNumber) {
		int numberOfKids = getNumber.size();
		int currentKid = 0;
		int dayNumber = 0;
		int correct = 0;
		String copyAnswer = null;
		String dishPerson = null;
		in.nextLine();
		do{
			currentKid = dayNumber % numberOfKids;
			dishPerson = (getNumber.get(currentKid));
			System.out.print("Input: ");
			copyAnswer = in.nextLine();
			dayNumber++;
			correct++;
		}while (copyAnswer.equals(dishPerson));
		return correct;
	}
	public static int easyProblem(List<String> getNumber) {
		int numberOfKids = getNumber.size();
		int currentKid = 0;
		int dayNumber = 0;
		int correct = 0;
		String copyAnswer = null;
		String dishPerson = null;
		in.nextLine();
		do{
			currentKid = dayNumber % numberOfKids;
			dishPerson = ("Day " + (dayNumber) + ": " 
					+ (getNumber.get(currentKid)) + " must do the dishes.");
			System.out.println(dishPerson);
			System.out.print("Copy the statement: ");
			copyAnswer = in.nextLine();
			dayNumber++;
			correct++;
		}while(copyAnswer.equals(dishPerson));
		return correct;
	}
}