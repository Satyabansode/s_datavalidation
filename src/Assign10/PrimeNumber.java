package Assign10;

import java.util.Scanner;

/*
* Program-1
* Write java program to check whether number is prime or not(Prime number
* means which is divisible by two numbers only i.e. 1 and itself only.
* if any number is divisible by any other number except mentioned then its not prime number.*/

public class PrimeNumber {
	public static void main(String[] args) {

		int count = 0;
		int num = 7;
		for (int i = num; i > 0; i--) {
			if (num % i == 0) {
				count++;
			}
		}
		if (count > 2) {
			System.out.println("Prime Number");
		} else {
			System.out.println("Not Prime");
		}
	}
}
