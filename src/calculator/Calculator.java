package calculator;

public class Calculator {
	int a = 10;
	int b = 20;

	public Calculator(int a, int b) {
		System.out.println(a);
		System.out.println(b);
	}

	public int add(int a, int b) {
		int sum = a + b;
		System.out.println("Addition of A and B is:" + sum);
		return sum;
	}

	public int sub(int a, int b) {
		int difference = a - b;
		System.out.println("Difference of A and B is:" + difference);
		return difference;
	}

	public int mul(int a, int b) {
		int product = a * b;
		System.out.println("Product of A and B is:" + product);
		return product;
	}

	public int divide(int a, int b) {
		try {
			System.out.println(a / b);
		} catch (IllegalArgumentException e) {
			System.out.println("Cannot divide by Zero");
		}
		System.out.println("Successfully done");
		return a;
	}

	public static void main(String[] args) {
		Calculator c = new Calculator(10, 20);
		c.add(10, 20);
		c.sub(22, 10);
		c.mul(10, 20);
		c.divide(10, 0);
	}
}
