package Assign8;

import java.util.Scanner;

public class EmployeeInformation {
	public void getUserInput() {

		Employee employee = new Employee();
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the firstname>>");
		employee.firstName = sc.nextLine();

		System.out.println("Enter the Lasttname>>");
		employee.lastName = sc.nextLine();

		System.out.println("Enter the city>>");
		employee.city = sc.nextLine();

		System.out.println("Enter the mobileNumber>>");
		employee.mobileNumber = sc.nextLong();

		getStudentInformation(employee.firstName, employee.lastName, employee.city, employee.mobileNumber,
				Employee.country);
	}

	// Method used for get all student details
	public void getStudentInformation(String fNname, String lName, String city, long mobNum, String country) {
		// Printing the student details
		System.out.println("Student Information:");
		System.out.println("First Name: " + fNname);
		System.out.println("Last Name: " + lName);
		System.out.println("City: " + city);
		System.out.println("Mobile number: " + mobNum);
		System.out.println("Country: " + country);
	}

	public static void main(String[] args) {
		// Creating the object for EmployeeInformation class
		EmployeeInformation employeeInformation = new EmployeeInformation();
		System.out.println("Enter the number of student>>");
		Scanner input = new Scanner(System.in);
		int count = input.nextInt();
		for (int i = 1; i <= count; i++) {
			System.out.println("Enter the Student details>>");
			employeeInformation.getUserInput(); // calling method for taking input values from user
		}
	}
}
