package Assign4;

/* 
* Program-2
 Write the java program to design method for substraction of two number which 
 returns int results to that method and result should be print into main method*/
public class Substraction {
	public int substraction(int a, int b) {
		int c = a - b;
		return c;
	}

	public static void main(String[] args) {
		Substraction sub = new Substraction();
		int sum = sub.substraction(20, 5);
		System.out.println(sum);
	}
}
