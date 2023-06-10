package Assign7;

import java.util.Scanner;

/* Program-1
Design method to check whether the character is alphabet, digit and special symbol.*/
public class CharacterType {
	public static void charType(int ch) {
		if (ch >= 65 && ch <= 90) { // Checking for Capital Alphabet ASCII value to check type of character
			System.out.println("It's a capital letter alphabet");
		} else if (ch >= 97 && ch <= 122) {
			System.out.println("It's a Small letter alphabet");
		} else if (ch >= 48 && ch <= 57) {
			System.out.println("it's a number");
		} else if ((ch >= 33 && ch <= 47) || (ch >= 58 && ch <= 64) || (ch >= 91 && ch <= 96)
				|| (ch >= 123 && ch <= 126)) {
			System.out.println("Its a Special character");
		} else {
			System.out.println("Incorrect Input");
		}
	}

	public static void main(String[] args) {
		System.out.println("Enter the character");
		Scanner s = new Scanner(System.in);
		int ch = s.next().charAt(0);
		charType(ch);
	}
}
