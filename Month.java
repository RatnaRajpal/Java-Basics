//Program to take input as the name of a month and return its corresponding integer representation
import java.util.Scanner;
public class Month {
public static void main(String args[]) {
	System.out.println("Enter the month name:");
	String month=new Scanner(System.in).nextLine().toLowerCase();
	switch(month) {
		case "january":
		case "jan":
			System.out.println(month+" is the 1st month of the year");
			break;
		case "february":
		case "feb":
			System.out.println(month+" is the 2nd month of the year");
			break;
		case "march":
		case "mar":
			System.out.println(month+" is the 3rd month of the year");
			break;
		case "april":
		case "apr":
			System.out.println(month+" is the 4th month of the year");
			break;
		case "may":
			System.out.println(month+" is the 5th month of the year");
			break;
		case "june":
		case "jun":
			System.out.println(month+" is the 6th month of the year");
			break;
		case "july":
		case "jul":
			System.out.println(month+" is the 7th month of the year");
			break;
		case "august":
		case "aug":
			System.out.println(month+" is the 8th month of the year");
			break;
		case "september":
		case "sept":
			System.out.println(month+" is the 9th month of the year");
			break;
		case "october":
		case "oct":
			System.out.println(month+" is the 10th month of the year");
			break;
		case "november":
		case "nov":
			System.out.println(month+" is the 11th month of the year");
			break;
		case "december":
		case "dec":
			System.out.println(month+" is the 12th month of the year");
			break;
		default:
			System.out.println("You Entered an invalid entry!!");	
	
	}
}
}
