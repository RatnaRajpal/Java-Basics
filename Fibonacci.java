//Print Fibonacci series without Recursion
import java.util.Scanner;
public class Fibonacci {
	int n1,n2;
    Fibonacci(){
    	n1=0;
    	n2=1;
    }
	void output(int num) {
		int temp;
		while(n1<=num) { //for(int i=0;i<num;i++)
			System.out.println(n1);
			temp=n1+n2;
			n1=n2;
			n2=temp;
		}
	}
	public static void main(String args[]) {
		System.out.println("Enter the number upto which you want to print the fibonacci series");
		int num=new Scanner(System.in).nextInt();
		Fibonacci fibo=new Fibonacci();
		fibo.output(num);
	}
}
