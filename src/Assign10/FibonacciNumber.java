package Assign10;

/*
* Program-2
* Write a java program to display the Fibonacci series up to given number. 
* (Fibonacci series mean next number is the sum of previous two numbers 
* for example 0,1,1,2,3,5,8,13,21,34,55 etc. If enter no as 5 then output is 0,1,1,2,3).*/
public class FibonacciNumber {
	public static void main(String[] args) {
		System.out.println("Fibonacci series less than 20");
		int a = 0;
		int b = 1;
		int c = 0;
		System.out.print(a + " " + b);
		while (c < 20) {
			c = a + b;// 0+1=1
			a = b;// 0
			b = c;// 1
			System.out.print(" " + c);
		}
	}
}
