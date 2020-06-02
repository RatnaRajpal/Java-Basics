import java.util.Scanner;
public class Positive_Negative {
public static void main(String args[]) {
	System.out.println("Enter the number :");
	int num=new Scanner(System.in).nextInt();
	if(num==0) 
		System.out.println("The entered number is zero.");
	else if(num>0) 
		System.out.println("The entered number is a Positive number.");
	else
		System.out.println("The entered number is a Negative number.");
}
}
