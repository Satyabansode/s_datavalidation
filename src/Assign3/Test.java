package Assign3;

// Program - Design separate method as String 
//getStudentName(String name)
// which return student name to that method and print it on console
public class Test {
	public String getStudentName(String name) {
		return name;
	}

	public static void main(String[] args) {
		Test t = new Test();
		String s = t.getStudentName("Satyajeet");
		System.out.println("Student name is:" + s);
	}
}
