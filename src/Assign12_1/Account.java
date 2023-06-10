package Assign12_1;

import java.util.Scanner;

/* Assignment No. 12
* Design the classes for IS relationship in java where SavingsAccount IS-A account.
* and input should be hard coded and display it into mentioned methods.*/
public class Account {
	int AccountNumber;
	String AccountName;

	public void getAccountDetails(int num) {
		System.out.println("Enter account Number");
		Scanner sc = new Scanner(System.in);
		int AccountNmber = sc.nextInt();

		System.out.println("Enter Account Holder Name");
		String AccountName = sc.next();

		getAccountInformation(AccountNumber, AccountName);
	}

	private void getAccountInformation(int AccountNumber, String AccountName) {
		System.out.println("AccountNumber" + AccountNumber);
		System.out.println("AccountName" + AccountName);
	}
}
