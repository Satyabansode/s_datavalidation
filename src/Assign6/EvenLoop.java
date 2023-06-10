package Assign6;

/*Program-3
write a program to print all even number from 50 to 75*/
public class EvenLoop {
	public static void main(String[] args) {
		for (int i = 50; i <= 75; i++) {
			while (i % 2 == 0) {
				System.out.println(i);
				i++;
			}
		}
	}
}