package Assign6;

/*Program-4
Design method int factorial(int no) which returns int value to that method. 
print the results into main method (Example enter no as 5, factorial means 5*4*3*2*1 then output is 120)
*/
public class Factorial {
	public int factorial(int no) {
		int fact = 1;
		for (int i = 1; i <= no; i++) {
			fact = fact * i;
		}
		return fact;
	}

	public static void main(String[] args) {
		Factorial f = new Factorial();
		int result = f.factorial(5);
		System.out.println("The factorial of 5 is:" + result);
	}
}