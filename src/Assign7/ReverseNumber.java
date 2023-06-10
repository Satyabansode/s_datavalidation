package Assign7;

import java.util.Scanner;
/*Program-4
Design method public int getReverseNumber(int num) which return int value to that method and result
 print into main method.*/
public class ReverseNumber {
	public static int getReverseNumber(int num) {
		int reverse = 0;
		while (num != 0) {
			reverse = reverse * 10;
			reverse = reverse + num % 10;
			num = num / 10;
		}
		return reverse;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number");
		int num = sc.nextInt();
		int reverseNumber = getReverseNumber(123);
		System.out.println(reverseNumber);
	}
}
