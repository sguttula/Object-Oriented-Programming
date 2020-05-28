import java.util.Scanner;
public class Lab1 {
	public static void main(String[] args) {
		double[] newArray = new double[10];
		System.out.print("Enter 10 values: ");
		displaySqrtOfArray(newArray);
		displayReciprocalArray(newArray);
		printArray(newArray);
		replace500Values(newArray);
	}
	public static double[] newArray (int values) {
		double[] myArray = new double[values];
		return myArray;
	}
	public static void displaySqrtOfArray (double[] newArray) {
		Scanner in = new Scanner(System.in);
		for(int i = 0 ; i < newArray.length ; i++) {
			newArray[i] = in.nextDouble();
		}
		System.out.println();
		double root = Math.sqrt(newArray[0]);
		double root1 = Math.sqrt(newArray[1]);
		double root2 = Math.sqrt(newArray[2]);
		double root3 = Math.sqrt(newArray[3]);
		double root4 = Math.sqrt(newArray[4]);
		double root5 = Math.sqrt(newArray[5]);
		double root6 = Math.sqrt(newArray[6]);
		double root7 = Math.sqrt(newArray[7]);
		double root8 = Math.sqrt(newArray[8]);
		double root9 = Math.sqrt(newArray[9]);
		System.out.println("Square root values: \t" + root
				+ ", " + root1 + ", " + root2 + ", " + root3 + 
				", " + root4 + ", " + root5 + ", " + root6 +
				", " + root7 + ", " + root8 + ", " + root9);
	}
	public static void displayReciprocalArray (double[] newArray) {
		for(int i = 0 ; i < newArray.length ; i++) {
		}
		double reciprocal = newArray[0] * (1/(Math.pow(newArray[0], 2)));
		double reciprocal1 = newArray[1] * (1/(Math.pow(newArray[1], 2)));
		double reciprocal2 = newArray[2] * (1/(Math.pow(newArray[2], 2)));
		double reciprocal3 = newArray[3] * (1/(Math.pow(newArray[3], 2)));
		double reciprocal4 = newArray[4] * (1/(Math.pow(newArray[4], 2)));
		double reciprocal5 = newArray[5] * (1/(Math.pow(newArray[5], 2)));
		double reciprocal6 = newArray[6] * (1/(Math.pow(newArray[6], 2)));
		double reciprocal7 = newArray[7] * (1/(Math.pow(newArray[7], 2)));
		double reciprocal8 = newArray[8] * (1/(Math.pow(newArray[8], 2)));
		double reciprocal9 = newArray[9] * (1/(Math.pow(newArray[9], 2)));
		System.out.println("Reciprocal values: \t" + reciprocal
				+ ", " + reciprocal1 + ", " + reciprocal2 + ", " +
				reciprocal3 + ", " + reciprocal4 + ", " + reciprocal5
				+ ", " + reciprocal6 + ", " + reciprocal7 + ", " +
				reciprocal8 + ", " + reciprocal9);
	}
	public static void printArray (double[] newArray) {
		for(int i = 0 ; i < newArray.length ; i++) {
		}
		System.out.println("Original array values: \t" + newArray[0] + ", " + newArray[1] + ", " + newArray[2] + ", " + newArray[3] + 
				", " + newArray[4] + ", " + newArray[5] + ", " + newArray[6] +
				", " + newArray[7] + ", " + newArray[8] + ", " + newArray[9]);
	}
	public static void replace500Values (double[] newArray) {
		int number = 0;
		for(int i = 0 ; i < newArray.length ; i++) {
			if(newArray[i] > 500) {
				number++;
				newArray[i] = 500;
			}
		}
		System.out.println("Replacement values: \t" +  newArray[0] + ", " + newArray[1] + ", " + newArray[2] + ", " + newArray[3] + 
				", " + newArray[4] + ", " + newArray[5] + ", " + newArray[6] +
				", " + newArray[7] + ", " + newArray[8] + ", " + newArray[9]);
	}
}
