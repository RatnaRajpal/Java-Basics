import java.util.Scanner;
public class Leap_year {
public static void main(String args[]) {
	System.out.print("Enter the Year :");
	int year=new Scanner(System.in).nextInt(); 
	System.out.println(((year%400==0)||(year%100!=0&&year%4==0 ))?("The year " +year+ " is a Leap Year"):("The year " +year+ " is not a Leap Year"));
}
}
