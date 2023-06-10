package Assign5;

/*Program-2
write a program to check whether year is leap year or not. (If else stmt). */
public class LeapYear {
	public static void main(String[] args) {
//	int year=2023;
//	if(year%4==0) {
//		System.out.println(year+": is leap year");
//	}
//	else {
//		System.out.println(year+": is not leap year");
//	}

		int year = 2022;
		if ((year % 4 == 0) & (year % 100 != 0) & (year % 400 == 0)) {
			System.out.println(year + ": is leap year");
		} else {
			System.out.println(year + ": is not leap year");
		}
	}
}
