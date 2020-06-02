//Program to take a integer as input and find its factorial
import java.util.Scanner;

public class Factorial {
	int find_fact(int num) {
		if(num==1)
			return 1;
		else
			return num*find_fact(num-1);
	}
	public static void main(String args[]) {
		System.out.println("Enter the number :");
		Factorial fact=new Factorial();
		System.out.println("Factorial:"+fact.find_fact(new Scanner(System.in).nextInt()));
}
}
