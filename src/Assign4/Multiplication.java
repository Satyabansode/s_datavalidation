package Assign4;

public class Multiplication {
	public int getMultiplication(int a, int b) {
		int c = a * b;
		return c;
	}

	public static void main(String[] args) {
		Multiplication mul = new Multiplication();
		int m = mul.getMultiplication(20, 10);
		System.out.println(m);
	}
}
