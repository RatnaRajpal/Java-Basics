//Program to check whether the given number is a prime number
import java.util.Scanner;

public class Prime_Number {
	void check(int num) {
		int i;
		for(i=2;i<num;i++) {
			if(num%i ==0) {
				break;
			}
		}
		if(i==num) {
			System.out.println("The number "+num+" is a prime number.");
		}
		else
			System.out.println("The number "+num+" is not a prime number.");
	
}
	public static void main(String args[]) {
		System.out.println("Enter the number :");
		int num=new Scanner(System.in).nextInt();
		Prime_Number prime=new Prime_Number();
		
		prime.check(num);
}
}
