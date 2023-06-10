package Assign4;

/*Program-1
Write the java program to design method for addition of two number which 
returns int results to that method and result should be print into main method*/
public class Addition {

	public int Addition(int a, int b) {
		int sum = a + b;
		return sum;
	}
	public static void main(String[] args) {
		Addition add = new Addition();
		int sum = add.Addition(20, 10);
		System.out.println("Addition of A and B is:" + sum);
	}
}
