package Assign9;

/*WAP in which create a multiple objects and display the count of the objects into class.*/
public class CountObjects {
	static int CountObjects = 0;

	CountObjects() {
		CountObjects++;
	}

	public static void getCountObjects() {
		System.out.println(CountObjects + ": objects are created");
	}

	public static void main(String[] args) {
		CountObjects ob1 = new CountObjects();
		CountObjects ob2 = new CountObjects();
		CountObjects ob3 = new CountObjects();
		CountObjects ob4 = new CountObjects();
		CountObjects ob5 = new CountObjects();
		getCountObjects();
	}
}
