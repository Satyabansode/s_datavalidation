package Assign7;

import java.util.Scanner;

/*Program-3
Design method to print factors of given number( Enter no = 6 then
factors should be displayed like 1,2,3,6.
*/
public class Factors {
	public static void getFactors(int number) {
		int i = 1;
		while (i <= number) {
			if (number % i == 0) {
				System.out.println(i);
			}
			i++;
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number");
		int number = sc.nextInt();
		System.out.println("factors of " + number + " are:");
		getFactors(6);
	}
}
