import java.util.Scanner;
public class Odd_Even {
public static void main(String args[]) {
	System.out.print("Enter the number :");
	int num=new Scanner(System.in).nextInt();
	System.out.println((num%2 == 0)? ("The number "+num+" is a Even number"):("The number "+num+" is a Odd number"));
}
}
