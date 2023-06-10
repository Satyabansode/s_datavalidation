package Assign4;
/*Program-5
Write the Java Program to calculate total of five subject marks and average of it. */

public class Subjects {
	public static void main(String[] args) {
		int p = 67;
		int c = 56;
		int m = 77;
		int b = 87;
		int e = 89;

		int total = p + c + m + b + e;
		System.out.println(total);

		float average = total / 5;
		// int average = total / 5;
		System.out.println(average);
	}
}
