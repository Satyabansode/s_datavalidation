package Assign5;

/* Program-8
Write a program to swap the two numbers */
public class SwapNumber {
	public static void main(String[] args) {

		int a = 10;
		int b = 20;
		int temp;
		System.out.println("Before Swaping ");
		System.out.println("a : " + a + " & b : " + b);
		temp = a;
		a = b;
		b = temp;
		System.out.println("After swapping");
	  System.out.println("a : " + a + " & b : " + b);
	}
}