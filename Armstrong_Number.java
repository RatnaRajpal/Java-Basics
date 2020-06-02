//To print whether the entered number is a Armsrong Number or not
import java.util.Scanner;

public class Armstrong_Number {
	int check(int num) {
		if(num==0) {
			return 0;
		}
		else
			return (num%10)*(num%10)*(num%10)+check(num/10);
	}
	public static void main(String args[]) {
		System.out.println("Enter the number :");
		int num=new Scanner(System.in).nextInt();
		Armstrong_Number armst_no=new Armstrong_Number();
		int res=armst_no.check(num);
		System.out.println((num==res)?"Armstrong Number":"Not an Armstrong number");
}
}
