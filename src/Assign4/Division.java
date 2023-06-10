package Assign4;

public class Division {
	public int division(int a, int b) {
		int c = a / b;
		return c;
	}

	public static void main(String[] args) {
		Division d = new Division();
		int div = d.division(200, 8);
		System.out.println(div);
	}
}
