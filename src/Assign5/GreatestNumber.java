package Assign5;
/* Program-3
write a program to find out maximum number among three number(if else if ladder statement) */

public class GreatestNumber {
	public static void main(String[] args) {
		int x = 100;
		int y = 200;
		int z = 150;
		if (x > y && x > z) {
			System.out.println(x + ": is greater number among three numbers");
		} else if (y > z && y > x) {
			System.out.println(y + ": is greater number among three numbers");
		} else {
			System.out.println(z + ": is greater number among three numbers");
		}
	}
}
