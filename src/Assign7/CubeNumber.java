package Assign7;

import java.util.Scanner;

/*Design method public int getNumberCube(int num), return int value to that method and result 
		should be print into main method
*/

public class CubeNumber {
	public static int getNumberCube(int num) {
		int result = num * num * num;
		return result;
	}

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		// creating object of class Scanner
		System.out.println("Enter a number>>");
		int number = scanner.nextInt(); // capturing the number entered by user
		int result = getNumberCube(number); // calling getNumberCube method to perform calculation of cube of number
		// entered by user
		System.out.println("The Cube of number " + number + " is=" + result); // Printing the result on console
	}
}
