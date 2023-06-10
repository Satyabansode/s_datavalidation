package Assign12_1;

import java.util.Scanner;

public class SavingAccount {
    String AccountType;
    Long balance;
    
    
    public void getSavingAccountDetails() {
    	System.out.println("Enter the AccountDetails");
    	Scanner sc=new Scanner(System.in);
    	String SavingAccountDetails=sc.nextLine();
    	
    	System.out.println("Enter the Balance");
    	Long Balance=sc.nextLong();
    	
    	 getSavingAccountInformation1(balance);
    }
    
    	private void getSavingAccountInformation1( long balance) {
    		System.out.println("AccountType" + AccountType);
    		System.out.println("balance" + balance);
    }
}
