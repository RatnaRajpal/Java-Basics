//Program to take an Integer as input and check whether it is a plaindrome or not
import java.util.Scanner;
public class Palindrome {
void check(int num) {
	int temp=0;
	int num1=num;
	while(num1!=0) {
		temp=temp*10+num1%10;
		num1=num1/10;
	}
	System.out.println((num==temp)?"Palindrome":"Not a Palindrome");
}
public static void main(String args[]) {
	Palindrome p=new Palindrome();
	System.out.print("Enter the number :");
	p.check(new Scanner(System.in).nextInt());
}
}
