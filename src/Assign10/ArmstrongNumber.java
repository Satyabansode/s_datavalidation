package Assign10;

/*Program-3
Write java program to check whether number is Armstrong or not.
(A positive number is called Armstrong number if it is equal to the sum of cubes of its digits 
for example 0, 1, 153, 370, 371, 407 etc. Let's try to understand why 153 is an Armstrong number.*/
public class ArmstrongNumber {
	public static void main(String[] args) {

		int no = 153;
		int sum = 0;
		int rem = 0;
		int temp = no;
		while (temp > 0) {
			rem = temp % 10;
			sum = sum + rem * rem * rem;
			temp = temp / 10;
		}
		if (sum == no) {
			System.out.println("Armstrong Number");
		} else {
			System.out.println("Not Armstrong number");
		}
	}
}
